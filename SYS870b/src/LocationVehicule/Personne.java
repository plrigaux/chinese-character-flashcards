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
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Personne#getAgitCommeClient <em>Agit Comme Client</em>}</li>
 *   <li>{@link LocationVehicule.Personne#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link LocationVehicule.Personne#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVehicule.Personne#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link LocationVehicule.Personne#getDomicile <em>Domicile</em>}</li>
 *   <li>{@link LocationVehicule.Personne#getEstEmploye <em>Est Employe</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getPersonne()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomPasVide identifiantUnique prenomPasVide'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nomPasVide='nom.size() > 0' identifiantUnique='Personne.allInstances()->isUnique(personne : Personne | personne.identifiant)' prenomPasVide='prenom.size() > 0'"
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Agit Comme Client</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Client#getEst <em>Est</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agit Comme Client</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agit Comme Client</em>' containment reference.
	 * @see #setAgitCommeClient(Client)
	 * @see LocationVehicule.LocationVehiculePackage#getPersonne_AgitCommeClient()
	 * @see LocationVehicule.Client#getEst
	 * @model opposite="est" containment="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Client getAgitCommeClient();

	/**
	 * Sets the value of the '{@link LocationVehicule.Personne#getAgitCommeClient <em>Agit Comme Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agit Comme Client</em>' containment reference.
	 * @see #getAgitCommeClient()
	 * @generated
	 */
	void setAgitCommeClient(Client value);

	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see LocationVehicule.LocationVehiculePackage#getPersonne_Identifiant()
	 * @model
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link LocationVehicule.Personne#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

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
	 * @see LocationVehicule.LocationVehiculePackage#getPersonne_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LocationVehicule.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see LocationVehicule.LocationVehiculePackage#getPersonne_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link LocationVehicule.Personne#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Domicile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domicile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domicile</em>' containment reference.
	 * @see #setDomicile(Localisation)
	 * @see LocationVehicule.LocationVehiculePackage#getPersonne_Domicile()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Localisation getDomicile();

	/**
	 * Sets the value of the '{@link LocationVehicule.Personne#getDomicile <em>Domicile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domicile</em>' containment reference.
	 * @see #getDomicile()
	 * @generated
	 */
	void setDomicile(Localisation value);

	/**
	 * Returns the value of the '<em><b>Est Employe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.EmployeAgence#getEst <em>Est</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Employe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Employe</em>' container reference.
	 * @see #setEstEmploye(EmployeAgence)
	 * @see LocationVehicule.LocationVehiculePackage#getPersonne_EstEmploye()
	 * @see LocationVehicule.EmployeAgence#getEst
	 * @model opposite="est" transient="false"
	 * @generated
	 */
	EmployeAgence getEstEmploye();

	/**
	 * Sets the value of the '{@link LocationVehicule.Personne#getEstEmploye <em>Est Employe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Employe</em>' container reference.
	 * @see #getEstEmploye()
	 * @generated
	 */
	void setEstEmploye(EmployeAgence value);

} // Personne
