/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Localisation#getAdresseCivique <em>Adresse Civique</em>}</li>
 *   <li>{@link LocationVehicule.Localisation#getVille <em>Ville</em>}</li>
 *   <li>{@link LocationVehicule.Localisation#getPays <em>Pays</em>}</li>
 *   <li>{@link LocationVehicule.Localisation#getTelephone <em>Telephone</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getLocalisation()
 * @model
 * @generated
 */
public interface Localisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse Civique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Civique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Civique</em>' attribute.
	 * @see #setAdresseCivique(String)
	 * @see LocationVehicule.LocationVehiculePackage#getLocalisation_AdresseCivique()
	 * @model
	 * @generated
	 */
	String getAdresseCivique();

	/**
	 * Sets the value of the '{@link LocationVehicule.Localisation#getAdresseCivique <em>Adresse Civique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Civique</em>' attribute.
	 * @see #getAdresseCivique()
	 * @generated
	 */
	void setAdresseCivique(String value);

	/**
	 * Returns the value of the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ville</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville</em>' attribute.
	 * @see #setVille(String)
	 * @see LocationVehicule.LocationVehiculePackage#getLocalisation_Ville()
	 * @model
	 * @generated
	 */
	String getVille();

	/**
	 * Sets the value of the '{@link LocationVehicule.Localisation#getVille <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville</em>' attribute.
	 * @see #getVille()
	 * @generated
	 */
	void setVille(String value);

	/**
	 * Returns the value of the '<em><b>Pays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pays</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pays</em>' attribute.
	 * @see #setPays(String)
	 * @see LocationVehicule.LocationVehiculePackage#getLocalisation_Pays()
	 * @model
	 * @generated
	 */
	String getPays();

	/**
	 * Sets the value of the '{@link LocationVehicule.Localisation#getPays <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pays</em>' attribute.
	 * @see #getPays()
	 * @generated
	 */
	void setPays(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see LocationVehicule.LocationVehiculePackage#getLocalisation_Telephone()
	 * @model
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link LocationVehicule.Localisation#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

} // Localisation
