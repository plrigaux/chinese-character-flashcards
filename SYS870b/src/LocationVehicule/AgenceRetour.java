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
 * A representation of the model object '<em><b>Agence Retour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.AgenceRetour#getRecoit <em>Recoit</em>}</li>
 *   <li>{@link LocationVehicule.AgenceRetour#getRecepteurEstJouePar <em>Recepteur Est Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getAgenceRetour()
 * @model
 * @generated
 */
public interface AgenceRetour extends EObject {
	/**
	 * Returns the value of the '<em><b>Recoit</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Retour}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Retour#getEstRecuePar <em>Est Recue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recoit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recoit</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceRetour_Recoit()
	 * @see LocationVehicule.Retour#getEstRecuePar
	 * @model type="LocationVehicule.Retour" opposite="estRecuePar"
	 * @generated
	 */
	EList getRecoit();

	/**
	 * Returns the value of the '<em><b>Recepteur Est Joue Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Agence#getARoleRecepteur <em>ARole Recepteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recepteur Est Joue Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recepteur Est Joue Par</em>' reference.
	 * @see #setRecepteurEstJouePar(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceRetour_RecepteurEstJouePar()
	 * @see LocationVehicule.Agence#getARoleRecepteur
	 * @model opposite="aRoleRecepteur" required="true"
	 * @generated
	 */
	Agence getRecepteurEstJouePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.AgenceRetour#getRecepteurEstJouePar <em>Recepteur Est Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recepteur Est Joue Par</em>' reference.
	 * @see #getRecepteurEstJouePar()
	 * @generated
	 */
	void setRecepteurEstJouePar(Agence value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot post_uneVoituredePlus='self.recepteurEstJouePar.aEnInventaire->size() = self.recepteurEstJouePar.aEnInventaire->size() + 1'"
	 * @generated
	 */
	void recoitVoiture();

} // AgenceRetour
