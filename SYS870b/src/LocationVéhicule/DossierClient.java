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
 * A representation of the model object '<em><b>Dossier Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.DossierClient#getRefère <em>Refère</em>}</li>
 *   <li>{@link LocationVéhicule.DossierClient#getContient <em>Contient</em>}</li>
 *   <li>{@link LocationVéhicule.DossierClient#getRelateHistorique <em>Relate Historique</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getDossierClient()
 * @model
 * @generated
 */
public interface DossierClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Refère</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refère</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refère</em>' reference.
	 * @see #setRefère(Client)
	 * @see LocationVéhicule.LocationVéhiculePackage#getDossierClient_Refère()
	 * @model required="true"
	 * @generated
	 */
	Client getRefère();

	/**
	 * Sets the value of the '{@link LocationVéhicule.DossierClient#getRefère <em>Refère</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refère</em>' reference.
	 * @see #getRefère()
	 * @generated
	 */
	void setRefère(Client value);

	/**
	 * Returns the value of the '<em><b>Contient</b></em>' reference list.
	 * The list contents are of type {@link LocationVéhicule.MauvaiseExpérience}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contient</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' reference list.
	 * @see LocationVéhicule.LocationVéhiculePackage#getDossierClient_Contient()
	 * @model
	 * @generated
	 */
	EList<MauvaiseExpérience> getContient();

	/**
	 * Returns the value of the '<em><b>Relate Historique</b></em>' reference list.
	 * The list contents are of type {@link LocationVéhicule.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relate Historique</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relate Historique</em>' reference list.
	 * @see LocationVéhicule.LocationVéhiculePackage#getDossierClient_RelateHistorique()
	 * @model
	 * @generated
	 */
	EList<Location> getRelateHistorique();

} // DossierClient
