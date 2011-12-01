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
 * A representation of the model object '<em><b>Agence Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.AgenceReservation#getFournit <em>Fournit</em>}</li>
 *   <li>{@link LocationVehicule.AgenceReservation#getFournisseurEstJouePar <em>Fournisseur Est Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getAgenceReservation()
 * @model
 * @generated
 */
public interface AgenceReservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Fournit</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Reservation}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Reservation#getEstFourniePar <em>Est Fournie Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fournit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fournit</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceReservation_Fournit()
	 * @see LocationVehicule.Reservation#getEstFourniePar
	 * @model type="LocationVehicule.Reservation" opposite="estFourniePar"
	 * @generated
	 */
	EList getFournit();

	/**
	 * Returns the value of the '<em><b>Fournisseur Est Joue Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Agence#getARoleFournisseur <em>ARole Fournisseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fournisseur Est Joue Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fournisseur Est Joue Par</em>' reference.
	 * @see #setFournisseurEstJouePar(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceReservation_FournisseurEstJouePar()
	 * @see LocationVehicule.Agence#getARoleFournisseur
	 * @model opposite="aRoleFournisseur" required="true"
	 * @generated
	 */
	Agence getFournisseurEstJouePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.AgenceReservation#getFournisseurEstJouePar <em>Fournisseur Est Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fournisseur Est Joue Par</em>' reference.
	 * @see #getFournisseurEstJouePar()
	 * @generated
	 */
	void setFournisseurEstJouePar(Agence value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enregistre();

} // AgenceReservation
