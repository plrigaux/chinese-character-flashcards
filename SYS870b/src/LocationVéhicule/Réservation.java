/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Réservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Réservation#getRéfère <em>Réfère</em>}</li>
 *   <li>{@link LocationVéhicule.Réservation#getDateDébut <em>Date Début</em>}</li>
 *   <li>{@link LocationVéhicule.Réservation#getCatégorie <em>Catégorie</em>}</li>
 *   <li>{@link LocationVéhicule.Réservation#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link LocationVéhicule.Réservation#isPréalable <em>Préalable</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getRéservation()
 * @model
 * @generated
 */
public interface Réservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Réfère</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Réfère</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Réfère</em>' reference.
	 * @see #setRéfère(Voiture)
	 * @see LocationVéhicule.LocationVéhiculePackage#getRéservation_Réfère()
	 * @model required="true"
	 * @generated
	 */
	Voiture getRéfère();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Réservation#getRéfère <em>Réfère</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Réfère</em>' reference.
	 * @see #getRéfère()
	 * @generated
	 */
	void setRéfère(Voiture value);

	/**
	 * Returns the value of the '<em><b>Date Début</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Début</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Début</em>' attribute.
	 * @see #setDateDébut(Date)
	 * @see LocationVéhicule.LocationVéhiculePackage#getRéservation_DateDébut()
	 * @model
	 * @generated
	 */
	Date getDateDébut();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Réservation#getDateDébut <em>Date Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Début</em>' attribute.
	 * @see #getDateDébut()
	 * @generated
	 */
	void setDateDébut(Date value);

	/**
	 * Returns the value of the '<em><b>Catégorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catégorie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catégorie</em>' reference.
	 * @see #setCatégorie(Catégorie)
	 * @see LocationVéhicule.LocationVéhiculePackage#getRéservation_Catégorie()
	 * @model
	 * @generated
	 */
	Catégorie getCatégorie();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Réservation#getCatégorie <em>Catégorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catégorie</em>' reference.
	 * @see #getCatégorie()
	 * @generated
	 */
	void setCatégorie(Catégorie value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see LocationVéhicule.LocationVéhiculePackage#getRéservation_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Réservation#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Préalable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Préalable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Préalable</em>' attribute.
	 * @see #setPréalable(boolean)
	 * @see LocationVéhicule.LocationVéhiculePackage#getRéservation_Préalable()
	 * @model
	 * @generated
	 */
	boolean isPréalable();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Réservation#isPréalable <em>Préalable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Préalable</em>' attribute.
	 * @see #isPréalable()
	 * @generated
	 */
	void setPréalable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getPériodeLocation();

} // Réservation
