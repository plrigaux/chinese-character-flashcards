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
 * A representation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Voiture#getEstDeCategorie <em>Est De Categorie</em>}</li>
 *   <li>{@link LocationVehicule.Voiture#getEstAssigne <em>Est Assigne</em>}</li>
 *   <li>{@link LocationVehicule.Voiture#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link LocationVehicule.Voiture#getEstAssigneeA <em>Est Assignee A</em>}</li>
 *   <li>{@link LocationVehicule.Voiture#isEnReparation <em>En Reparation</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getVoiture()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='identifiantUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot identifiantUnique='Voiture.allInstances()->isUnique(voiture : Voiture | voiture.identifiant)'"
 * @generated
 */
public interface Voiture extends EObject {
	/**
	 * Returns the value of the '<em><b>Est De Categorie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Categorie#getCategoriseVoiture <em>Categorise Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est De Categorie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est De Categorie</em>' reference.
	 * @see #setEstDeCategorie(Categorie)
	 * @see LocationVehicule.LocationVehiculePackage#getVoiture_EstDeCategorie()
	 * @see LocationVehicule.Categorie#getCategoriseVoiture
	 * @model opposite="categoriseVoiture" required="true"
	 * @generated
	 */
	Categorie getEstDeCategorie();

	/**
	 * Sets the value of the '{@link LocationVehicule.Voiture#getEstDeCategorie <em>Est De Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est De Categorie</em>' reference.
	 * @see #getEstDeCategorie()
	 * @generated
	 */
	void setEstDeCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Est Assigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Assigne</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Assigne</em>' reference.
	 * @see #setEstAssigne(Reservation)
	 * @see LocationVehicule.LocationVehiculePackage#getVoiture_EstAssigne()
	 * @model
	 * @generated
	 */
	Reservation getEstAssigne();

	/**
	 * Sets the value of the '{@link LocationVehicule.Voiture#getEstAssigne <em>Est Assigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Assigne</em>' reference.
	 * @see #getEstAssigne()
	 * @generated
	 */
	void setEstAssigne(Reservation value);

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
	 * @see LocationVehicule.LocationVehiculePackage#getVoiture_Identifiant()
	 * @model
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link LocationVehicule.Voiture#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Est Assignee A</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Transaction}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Transaction#getAssigne <em>Assigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Assignee A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Assignee A</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getVoiture_EstAssigneeA()
	 * @see LocationVehicule.Transaction#getAssigne
	 * @model type="LocationVehicule.Transaction" opposite="assigne"
	 * @generated
	 */
	EList getEstAssigneeA();

	/**
	 * Returns the value of the '<em><b>En Reparation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Reparation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Reparation</em>' attribute.
	 * @see #setEnReparation(boolean)
	 * @see LocationVehicule.LocationVehiculePackage#getVoiture_EnReparation()
	 * @model
	 * @generated
	 */
	boolean isEnReparation();

	/**
	 * Sets the value of the '{@link LocationVehicule.Voiture#isEnReparation <em>En Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>En Reparation</em>' attribute.
	 * @see #isEnReparation()
	 * @generated
	 */
	void setEnReparation(boolean value);

} // Voiture
