/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Agence#getPossède <em>Possède</em>}</li>
 *   <li>{@link LocationVéhicule.Agence#getA <em>A</em>}</li>
 *   <li>{@link LocationVéhicule.Agence#getEstDirigéPar <em>Est Dirigé Par</em>}</li>
 *   <li>{@link LocationVéhicule.Agence#getNombreVéhicule <em>Nombre Véhicule</em>}</li>
 *   <li>{@link LocationVéhicule.Agence#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVéhicule.Agence#getSeSitue <em>Se Situe</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getAgence()
 * @model
 * @generated
 */
public interface Agence extends EObject {
	/**
	 * Returns the value of the '<em><b>Possède</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possède</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possède</em>' reference.
	 * @see #setPossède(Voiture)
	 * @see LocationVéhicule.LocationVéhiculePackage#getAgence_Possède()
	 * @model
	 * @generated
	 */
	Voiture getPossède();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Agence#getPossède <em>Possède</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possède</em>' reference.
	 * @see #getPossède()
	 * @generated
	 */
	void setPossède(Voiture value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link LocationVéhicule.Commis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see LocationVéhicule.LocationVéhiculePackage#getAgence_A()
	 * @model required="true"
	 * @generated
	 */
	EList<Commis> getA();

	/**
	 * Returns the value of the '<em><b>Est Dirigé Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Dirigé Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dirigé Par</em>' reference.
	 * @see #setEstDirigéPar(Gestionnaire)
	 * @see LocationVéhicule.LocationVéhiculePackage#getAgence_EstDirigéPar()
	 * @model required="true"
	 * @generated
	 */
	Gestionnaire getEstDirigéPar();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Agence#getEstDirigéPar <em>Est Dirigé Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Dirigé Par</em>' reference.
	 * @see #getEstDirigéPar()
	 * @generated
	 */
	void setEstDirigéPar(Gestionnaire value);

	/**
	 * Returns the value of the '<em><b>Nombre Véhicule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Véhicule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Véhicule</em>' attribute.
	 * @see #setNombreVéhicule(int)
	 * @see LocationVéhicule.LocationVéhiculePackage#getAgence_NombreVéhicule()
	 * @model
	 * @generated
	 */
	int getNombreVéhicule();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Agence#getNombreVéhicule <em>Nombre Véhicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Véhicule</em>' attribute.
	 * @see #getNombreVéhicule()
	 * @generated
	 */
	void setNombreVéhicule(int value);

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
	 * @see LocationVéhicule.LocationVéhiculePackage#getAgence_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Agence#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Se Situe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Situe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Situe</em>' reference.
	 * @see #setSeSitue(Localisation)
	 * @see LocationVéhicule.LocationVéhiculePackage#getAgence_SeSitue()
	 * @model required="true"
	 * @generated
	 */
	Localisation getSeSitue();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Agence#getSeSitue <em>Se Situe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se Situe</em>' reference.
	 * @see #getSeSitue()
	 * @generated
	 */
	void setSeSitue(Localisation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean aVoitureDisponible();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void demandeVéhiculeÀAutreAgence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int nbVoituresDemandés(Catégorie catégorie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int nbVoituresDisponible(Catégorie catégorie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transfèreVoiture();

} // Agence
