/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.util;

import LocationVehicule.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see LocationVehicule.LocationVehiculePackage
 * @generated
 */
public class LocationVehiculeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LocationVehiculeValidator INSTANCE = new LocationVehiculeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "LocationVehicule";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVehiculeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return LocationVehiculePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case LocationVehiculePackage.PERSONNE:
				return validatePersonne((Personne)value, diagnostics, context);
			case LocationVehiculePackage.CLIENT:
				return validateClient((Client)value, diagnostics, context);
			case LocationVehiculePackage.RESERVATION:
				return validateReservation((Reservation)value, diagnostics, context);
			case LocationVehiculePackage.VOITURE:
				return validateVoiture((Voiture)value, diagnostics, context);
			case LocationVehiculePackage.AGENCE:
				return validateAgence((Agence)value, diagnostics, context);
			case LocationVehiculePackage.COMMIS:
				return validateCommis((Commis)value, diagnostics, context);
			case LocationVehiculePackage.GESTIONNAIRE:
				return validateGestionnaire((Gestionnaire)value, diagnostics, context);
			case LocationVehiculePackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case LocationVehiculePackage.CATEGORIE:
				return validateCategorie((Categorie)value, diagnostics, context);
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE:
				return validateMauvaiseExperience((MauvaiseExperience)value, diagnostics, context);
			case LocationVehiculePackage.LOCALISATION:
				return validateLocalisation((Localisation)value, diagnostics, context);
			case LocationVehiculePackage.EMPLOYE_AGENCE:
				return validateEmployeAgence((EmployeAgence)value, diagnostics, context);
			case LocationVehiculePackage.RETOUR:
				return validateRetour((Retour)value, diagnostics, context);
			case LocationVehiculePackage.AGENCE_RESERVATION:
				return validateAgenceReservation((AgenceReservation)value, diagnostics, context);
			case LocationVehiculePackage.AGENCE_LOCATION:
				return validateAgenceLocation((AgenceLocation)value, diagnostics, context);
			case LocationVehiculePackage.AGENCE_RETOUR:
				return validateAgenceRetour((AgenceRetour)value, diagnostics, context);
			case LocationVehiculePackage.AGENCE_TRANSFERT:
				return validateAgenceTransfert((AgenceTransfert)value, diagnostics, context);
			case LocationVehiculePackage.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case LocationVehiculePackage.TRANSFERT:
				return validateTransfert((Transfert)value, diagnostics, context);
			case LocationVehiculePackage.STATUT:
				return validateStatut((Statut)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne(Personne personne, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_nomPasVide(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_identifiantUnique(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_prenomPasVide(personne, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomPasVide constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_nomPasVide(Personne personne, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "nomPasVide", getObjectLabel(personne, context) }),
						 new Object[] { personne }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the identifiantUnique constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_identifiantUnique(Personne personne, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "identifiantUnique", getObjectLabel(personne, context) }),
						 new Object[] { personne }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the prenomPasVide constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_prenomPasVide(Personne personne, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "prenomPasVide", getObjectLabel(personne, context) }),
						 new Object[] { personne }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient(Client client, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(client, diagnostics, context);
		if (result || diagnostics != null) result &= validateClient_uneSeuleVoitureLouee(client, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uneSeuleVoitureLouee constraint of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient_uneSeuleVoitureLouee(Client client, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uneSeuleVoitureLouee", getObjectLabel(client, context) }),
						 new Object[] { client }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservation(Reservation reservation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservation_statutTermine(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservation_periodeLocation(reservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservation_dateTransaction(reservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the statutTermine constraint of '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservation_statutTermine(Reservation reservation, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "statutTermine", getObjectLabel(reservation, context) }),
						 new Object[] { reservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the periodeLocation constraint of '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservation_periodeLocation(Reservation reservation, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "periodeLocation", getObjectLabel(reservation, context) }),
						 new Object[] { reservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the dateTransaction constraint of '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservation_dateTransaction(Reservation reservation, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "dateTransaction", getObjectLabel(reservation, context) }),
						 new Object[] { reservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoiture(Voiture voiture, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(voiture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voiture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voiture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(voiture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(voiture, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoiture_identifiantUnique(voiture, diagnostics, context);
		return result;
	}

	/**
	 * Validates the identifiantUnique constraint of '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoiture_identifiantUnique(Voiture voiture, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "identifiantUnique", getObjectLabel(voiture, context) }),
						 new Object[] { voiture }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgence(Agence agence, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(agence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommis(Commis commis, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(commis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGestionnaire(Gestionnaire gestionnaire, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(gestionnaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(location, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocation_periodeLocation(location, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocation_locationImmediate(location, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocation_statutTermine(location, diagnostics, context);
		return result;
	}

	/**
	 * Validates the periodeLocation constraint of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation_periodeLocation(Location location, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "periodeLocation", getObjectLabel(location, context) }),
						 new Object[] { location }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the locationImmediate constraint of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation_locationImmediate(Location location, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "locationImmediate", getObjectLabel(location, context) }),
						 new Object[] { location }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the statutTermine constraint of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation_statutTermine(Location location, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "statutTermine", getObjectLabel(location, context) }),
						 new Object[] { location }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategorie(Categorie categorie, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(categorie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(categorie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(categorie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(categorie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(categorie, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategorie_identifiantUnique(categorie, diagnostics, context);
		return result;
	}

	/**
	 * Validates the identifiantUnique constraint of '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategorie_identifiantUnique(Categorie categorie, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "identifiantUnique", getObjectLabel(categorie, context) }),
						 new Object[] { categorie }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMauvaiseExperience(MauvaiseExperience mauvaiseExperience, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(mauvaiseExperience, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalisation(Localisation localisation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(localisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployeAgence(EmployeAgence employeAgence, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(employeAgence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetour(Retour retour, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(retour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(retour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(retour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(retour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(retour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRetour_statutTermine(retour, diagnostics, context);
		return result;
	}

	/**
	 * Validates the statutTermine constraint of '<em>Retour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetour_statutTermine(Retour retour, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "statutTermine", getObjectLabel(retour, context) }),
						 new Object[] { retour }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgenceReservation(AgenceReservation agenceReservation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(agenceReservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgenceLocation(AgenceLocation agenceLocation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(agenceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgenceRetour(AgenceRetour agenceRetour, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(agenceRetour, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgenceTransfert(AgenceTransfert agenceTransfert, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(agenceTransfert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(transaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransfert(Transfert transfert, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(transfert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatut(Statut statut, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //LocationVehiculeValidator
