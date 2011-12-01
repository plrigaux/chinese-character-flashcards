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
 * A representation of the model object '<em><b>Agence Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.AgenceLocation#getLoue <em>Loue</em>}</li>
 *   <li>{@link LocationVehicule.AgenceLocation#getLocateurEstJouePar <em>Locateur Est Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getAgenceLocation()
 * @model
 * @generated
 */
public interface AgenceLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Loue</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Location}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Location#getEstLoueePar <em>Est Louee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loue</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceLocation_Loue()
	 * @see LocationVehicule.Location#getEstLoueePar
	 * @model type="LocationVehicule.Location" opposite="estLoueePar"
	 * @generated
	 */
	EList getLoue();

	/**
	 * Returns the value of the '<em><b>Locateur Est Joue Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Agence#getARoleLocateur <em>ARole Locateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locateur Est Joue Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locateur Est Joue Par</em>' reference.
	 * @see #setLocateurEstJouePar(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceLocation_LocateurEstJouePar()
	 * @see LocationVehicule.Agence#getARoleLocateur
	 * @model opposite="aRoleLocateur" required="true"
	 * @generated
	 */
	Agence getLocateurEstJouePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.AgenceLocation#getLocateurEstJouePar <em>Locateur Est Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locateur Est Joue Par</em>' reference.
	 * @see #getLocateurEstJouePar()
	 * @generated
	 */
	void setLocateurEstJouePar(Agence value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot pre_aVoiture='self.locateurEstJouePar.aEnInventaire->size() > 0' post_uneVoituredeMoins='self.locateurEstJouePar.aEnInventaire->size() = self.locateurEstJouePar.aEnInventaire->size() - 1'"
	 * @generated
	 */
	void loueVoiture();

} // AgenceLocation
