/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe Agence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.EmployeAgence#getTraite <em>Traite</em>}</li>
 *   <li>{@link LocationVehicule.EmployeAgence#getEst <em>Est</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getEmployeAgence()
 * @model abstract="true"
 * @generated
 */
public interface EmployeAgence extends EObject {
	/**
	 * Returns the value of the '<em><b>Traite</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Transaction}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Transaction#getEstTraiteePar <em>Est Traitee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traite</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getEmployeAgence_Traite()
	 * @see LocationVehicule.Transaction#getEstTraiteePar
	 * @model type="LocationVehicule.Transaction" opposite="estTraiteePar"
	 * @generated
	 */
	EList getTraite();

	/**
	 * Returns the value of the '<em><b>Est</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Personne#getEstEmploye <em>Est Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est</em>' containment reference.
	 * @see #setEst(Personne)
	 * @see LocationVehicule.LocationVehiculePackage#getEmployeAgence_Est()
	 * @see LocationVehicule.Personne#getEstEmploye
	 * @model opposite="estEmploye" containment="true"
	 * @generated
	 */
	Personne getEst();

	/**
	 * Sets the value of the '{@link LocationVehicule.EmployeAgence#getEst <em>Est</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est</em>' containment reference.
	 * @see #getEst()
	 * @generated
	 */
	void setEst(Personne value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void assigneVoitureAReservation();

} // EmployeAgence
