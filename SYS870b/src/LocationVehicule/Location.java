/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Location#getDatePrevueDuRetour <em>Date Prevue Du Retour</em>}</li>
 *   <li>{@link LocationVehicule.Location#getProduit <em>Produit</em>}</li>
 *   <li>{@link LocationVehicule.Location#getFaiteApartirDe <em>Faite Apartir De</em>}</li>
 *   <li>{@link LocationVehicule.Location#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link LocationVehicule.Location#getEstLoueePar <em>Est Louee Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='periodeLocation locationImmediate statutTermine'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot periodeLocation='datePrevueDuRetour._\'>\'(self.dateTransaction)' locationImmediate='immediate = self.faiteApartirDe = null' statutTermine='if self.produit <> null then statut = 1 else statut <> 1 endif'"
 * @generated
 */
public interface Location extends Transaction {
	/**
	 * Returns the value of the '<em><b>Date Prevue Du Retour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Prevue Du Retour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Prevue Du Retour</em>' attribute.
	 * @see #setDatePrevueDuRetour(Date)
	 * @see LocationVehicule.LocationVehiculePackage#getLocation_DatePrevueDuRetour()
	 * @model
	 * @generated
	 */
	Date getDatePrevueDuRetour();

	/**
	 * Sets the value of the '{@link LocationVehicule.Location#getDatePrevueDuRetour <em>Date Prevue Du Retour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Prevue Du Retour</em>' attribute.
	 * @see #getDatePrevueDuRetour()
	 * @generated
	 */
	void setDatePrevueDuRetour(Date value);

	/**
	 * Returns the value of the '<em><b>Produit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Retour#getEstLeProduitDe <em>Est Le Produit De</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produit</em>' reference.
	 * @see #setProduit(Retour)
	 * @see LocationVehicule.LocationVehiculePackage#getLocation_Produit()
	 * @see LocationVehicule.Retour#getEstLeProduitDe
	 * @model opposite="estLeProduitDe"
	 * @generated
	 */
	Retour getProduit();

	/**
	 * Sets the value of the '{@link LocationVehicule.Location#getProduit <em>Produit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produit</em>' reference.
	 * @see #getProduit()
	 * @generated
	 */
	void setProduit(Retour value);

	/**
	 * Returns the value of the '<em><b>Faite Apartir De</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Reservation#getFaiteEnVueDe <em>Faite En Vue De</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faite Apartir De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faite Apartir De</em>' reference.
	 * @see #setFaiteApartirDe(Reservation)
	 * @see LocationVehicule.LocationVehiculePackage#getLocation_FaiteApartirDe()
	 * @see LocationVehicule.Reservation#getFaiteEnVueDe
	 * @model opposite="faiteEnVueDe"
	 * @generated
	 */
	Reservation getFaiteApartirDe();

	/**
	 * Sets the value of the '{@link LocationVehicule.Location#getFaiteApartirDe <em>Faite Apartir De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faite Apartir De</em>' reference.
	 * @see #getFaiteApartirDe()
	 * @generated
	 */
	void setFaiteApartirDe(Reservation value);

	/**
	 * Returns the value of the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate</em>' attribute.
	 * @see #setImmediate(boolean)
	 * @see LocationVehicule.LocationVehiculePackage#getLocation_Immediate()
	 * @model
	 * @generated
	 */
	boolean isImmediate();

	/**
	 * Sets the value of the '{@link LocationVehicule.Location#isImmediate <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate</em>' attribute.
	 * @see #isImmediate()
	 * @generated
	 */
	void setImmediate(boolean value);

	/**
	 * Returns the value of the '<em><b>Est Louee Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceLocation#getLoue <em>Loue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Louee Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Louee Par</em>' reference.
	 * @see #setEstLoueePar(AgenceLocation)
	 * @see LocationVehicule.LocationVehiculePackage#getLocation_EstLoueePar()
	 * @see LocationVehicule.AgenceLocation#getLoue
	 * @model opposite="loue" required="true"
	 * @generated
	 */
	AgenceLocation getEstLoueePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.Location#getEstLoueePar <em>Est Louee Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Louee Par</em>' reference.
	 * @see #getEstLoueePar()
	 * @generated
	 */
	void setEstLoueePar(AgenceLocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Date getDuree();

} // Location
