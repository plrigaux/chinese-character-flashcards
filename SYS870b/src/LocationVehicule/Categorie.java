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
 * A representation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Categorie#getDemande <em>Demande</em>}</li>
 *   <li>{@link LocationVehicule.Categorie#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVehicule.Categorie#getCategoriseVoiture <em>Categorise Voiture</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getCategorie()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='identifiantUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot identifiantUnique='Categorie.allInstances()->isUnique(categorie : Categorie | categorie.nom)'"
 * @generated
 */
public interface Categorie extends EObject {
	/**
	 * Returns the value of the '<em><b>Demande</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Reservation}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Reservation#getDemandeePour <em>Demandee Pour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getCategorie_Demande()
	 * @see LocationVehicule.Reservation#getDemandeePour
	 * @model type="LocationVehicule.Reservation" opposite="demandeePour"
	 * @generated
	 */
	EList getDemande();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LocationVehicule.LocationVehiculePackage#getCategorie_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LocationVehicule.Categorie#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Categorise Voiture</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Voiture}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Voiture#getEstDeCategorie <em>Est De Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorise Voiture</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorise Voiture</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getCategorie_CategoriseVoiture()
	 * @see LocationVehicule.Voiture#getEstDeCategorie
	 * @model type="LocationVehicule.Voiture" opposite="estDeCategorie"
	 * @generated
	 */
	EList getCategoriseVoiture();

} // Categorie
