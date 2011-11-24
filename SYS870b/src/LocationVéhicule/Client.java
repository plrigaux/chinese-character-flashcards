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
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Client#getPossède <em>Possède</em>}</li>
 *   <li>{@link LocationVéhicule.Client#getLoue <em>Loue</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Possède</b></em>' reference list.
	 * The list contents are of type {@link LocationVéhicule.Réservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possède</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possède</em>' reference list.
	 * @see LocationVéhicule.LocationVéhiculePackage#getClient_Possède()
	 * @model
	 * @generated
	 */
	EList<Réservation> getPossède();

	/**
	 * Returns the value of the '<em><b>Loue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loue</em>' reference.
	 * @see #setLoue(Location)
	 * @see LocationVéhicule.LocationVéhiculePackage#getClient_Loue()
	 * @model
	 * @generated
	 */
	Location getLoue();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Client#getLoue <em>Loue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loue</em>' reference.
	 * @see #getLoue()
	 * @generated
	 */
	void setLoue(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void réserveVéhicule();

} // Client
