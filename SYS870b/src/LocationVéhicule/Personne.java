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
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Personne#getClient <em>Client</em>}</li>
 *   <li>{@link LocationVéhicule.Personne#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link LocationVéhicule.Personne#getGestionnaire <em>Gestionnaire</em>}</li>
 *   <li>{@link LocationVéhicule.Personne#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVéhicule.Personne#getPrénom <em>Prénom</em>}</li>
 *   <li>{@link LocationVéhicule.Personne#getDomicile <em>Domicile</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne_Client()
	 * @model
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Personne#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Commis)
	 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne_EReference0()
	 * @model
	 * @generated
	 */
	Commis getEReference0();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Personne#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Commis value);

	/**
	 * Returns the value of the '<em><b>Gestionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gestionnaire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gestionnaire</em>' reference.
	 * @see #setGestionnaire(Gestionnaire)
	 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne_Gestionnaire()
	 * @model
	 * @generated
	 */
	Gestionnaire getGestionnaire();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Personne#getGestionnaire <em>Gestionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gestionnaire</em>' reference.
	 * @see #getGestionnaire()
	 * @generated
	 */
	void setGestionnaire(Gestionnaire value);

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
	 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prénom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prénom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prénom</em>' attribute.
	 * @see #setPrénom(String)
	 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne_Prénom()
	 * @model
	 * @generated
	 */
	String getPrénom();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Personne#getPrénom <em>Prénom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prénom</em>' attribute.
	 * @see #getPrénom()
	 * @generated
	 */
	void setPrénom(String value);

	/**
	 * Returns the value of the '<em><b>Domicile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domicile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domicile</em>' reference.
	 * @see #setDomicile(Localisation)
	 * @see LocationVéhicule.LocationVéhiculePackage#getPersonne_Domicile()
	 * @model required="true"
	 * @generated
	 */
	Localisation getDomicile();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Personne#getDomicile <em>Domicile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domicile</em>' reference.
	 * @see #getDomicile()
	 * @generated
	 */
	void setDomicile(Localisation value);

} // Personne
