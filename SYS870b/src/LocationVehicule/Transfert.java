/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Transfert#getObjetDuTransfert <em>Objet Du Transfert</em>}</li>
 *   <li>{@link LocationVehicule.Transfert#getDe <em>De</em>}</li>
 *   <li>{@link LocationVehicule.Transfert#getTransfereVers <em>Transfere Vers</em>}</li>
 *   <li>{@link LocationVehicule.Transfert#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getTransfert()
 * @model
 * @generated
 */
public interface Transfert extends EObject {
	/**
	 * Returns the value of the '<em><b>Objet Du Transfert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objet Du Transfert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Du Transfert</em>' reference.
	 * @see #setObjetDuTransfert(Voiture)
	 * @see LocationVehicule.LocationVehiculePackage#getTransfert_ObjetDuTransfert()
	 * @model required="true"
	 * @generated
	 */
	Voiture getObjetDuTransfert();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transfert#getObjetDuTransfert <em>Objet Du Transfert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet Du Transfert</em>' reference.
	 * @see #getObjetDuTransfert()
	 * @generated
	 */
	void setObjetDuTransfert(Voiture value);

	/**
	 * Returns the value of the '<em><b>De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De</em>' reference.
	 * @see #setDe(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getTransfert_De()
	 * @model
	 * @generated
	 */
	Agence getDe();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transfert#getDe <em>De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>De</em>' reference.
	 * @see #getDe()
	 * @generated
	 */
	void setDe(Agence value);

	/**
	 * Returns the value of the '<em><b>Transfere Vers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfere Vers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfere Vers</em>' reference.
	 * @see #setTransfereVers(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getTransfert_TransfereVers()
	 * @model required="true"
	 * @generated
	 */
	Agence getTransfereVers();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transfert#getTransfereVers <em>Transfere Vers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfere Vers</em>' reference.
	 * @see #getTransfereVers()
	 * @generated
	 */
	void setTransfereVers(Agence value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see LocationVehicule.LocationVehiculePackage#getTransfert_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transfert#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Transfert
