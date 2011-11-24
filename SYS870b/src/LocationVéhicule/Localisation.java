/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Localisation#getVille <em>Ville</em>}</li>
 *   <li>{@link LocationVéhicule.Localisation#getPays <em>Pays</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getLocalisation()
 * @model
 * @generated
 */
public interface Localisation extends EObject {
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
	 * @see LocationVéhicule.LocationVéhiculePackage#getLocalisation_Ville()
	 * @model
	 * @generated
	 */
	String getVille();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Localisation#getVille <em>Ville</em>}' attribute.
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
	 * @see LocationVéhicule.LocationVéhiculePackage#getLocalisation_Pays()
	 * @model
	 * @generated
	 */
	String getPays();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Localisation#getPays <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pays</em>' attribute.
	 * @see #getPays()
	 * @generated
	 */
	void setPays(String value);

} // Localisation
