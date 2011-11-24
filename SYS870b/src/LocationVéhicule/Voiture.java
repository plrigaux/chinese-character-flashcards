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
 * A representation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Voiture#getEstClassé <em>Est Classé</em>}</li>
 *   <li>{@link LocationVéhicule.Voiture#getEstAssigné <em>Est Assigné</em>}</li>
 *   <li>{@link LocationVéhicule.Voiture#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getVoiture()
 * @model
 * @generated
 */
public interface Voiture extends EObject {
	/**
	 * Returns the value of the '<em><b>Est Classé</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Classé</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Classé</em>' reference.
	 * @see #setEstClassé(Catégorie)
	 * @see LocationVéhicule.LocationVéhiculePackage#getVoiture_EstClassé()
	 * @model required="true"
	 * @generated
	 */
	Catégorie getEstClassé();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Voiture#getEstClassé <em>Est Classé</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Classé</em>' reference.
	 * @see #getEstClassé()
	 * @generated
	 */
	void setEstClassé(Catégorie value);

	/**
	 * Returns the value of the '<em><b>Est Assigné</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Assigné</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Assigné</em>' reference.
	 * @see #setEstAssigné(Réservation)
	 * @see LocationVéhicule.LocationVéhiculePackage#getVoiture_EstAssigné()
	 * @model
	 * @generated
	 */
	Réservation getEstAssigné();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Voiture#getEstAssigné <em>Est Assigné</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Assigné</em>' reference.
	 * @see #getEstAssigné()
	 * @generated
	 */
	void setEstAssigné(Réservation value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see LocationVéhicule.LocationVéhiculePackage#getVoiture_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Voiture#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Voiture
