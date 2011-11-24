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
 * A representation of the model object '<em><b>Société UE Rent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.SociétéUERent#getPossède <em>Possède</em>}</li>
 *   <li>{@link LocationVéhicule.SociétéUERent#getEReference1 <em>EReference1</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getSociétéUERent()
 * @model
 * @generated
 */
public interface SociétéUERent extends EObject {
	/**
	 * Returns the value of the '<em><b>Possède</b></em>' reference list.
	 * The list contents are of type {@link LocationVéhicule.Agence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possède</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possède</em>' reference list.
	 * @see LocationVéhicule.LocationVéhiculePackage#getSociétéUERent_Possède()
	 * @model lower="1000" upper="1000"
	 * @generated
	 */
	EList<Agence> getPossède();

	/**
	 * Returns the value of the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference1</em>' reference.
	 * @see #setEReference1(DossierClient)
	 * @see LocationVéhicule.LocationVéhiculePackage#getSociétéUERent_EReference1()
	 * @model
	 * @generated
	 */
	DossierClient getEReference1();

	/**
	 * Sets the value of the '{@link LocationVéhicule.SociétéUERent#getEReference1 <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference1</em>' reference.
	 * @see #getEReference1()
	 * @generated
	 */
	void setEReference1(DossierClient value);

} // SociétéUERent
