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
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Client#getPossede <em>Possede</em>}</li>
 *   <li>{@link LocationVehicule.Client#getLoue <em>Loue</em>}</li>
 *   <li>{@link LocationVehicule.Client#getExecute <em>Execute</em>}</li>
 *   <li>{@link LocationVehicule.Client#getEst <em>Est</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getClient()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uneSeuleVoitureLouee'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uneSeuleVoitureLouee='let loc : Bag(Location) = execute->select(t : Transaction | t.oclIsTypeOf(Location)) in loc->iterate(locElem : Location ; locationUnique : Bag(Location) = Bag{} | locationUnique->includesAll(loc->select(l : Location | l.datePrevueDuRetour._\'>=\'(locElem.datePrevueDuRetour) and l.datePrevueDuRetour._\'<=\'(locElem.dateTransaction))))->size() <= 1'"
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Possede</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possede</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possede</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getClient_Possede()
	 * @model type="LocationVehicule.Reservation"
	 * @generated
	 */
	EList getPossede();

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
	 * @see LocationVehicule.LocationVehiculePackage#getClient_Loue()
	 * @model
	 * @generated
	 */
	Location getLoue();

	/**
	 * Sets the value of the '{@link LocationVehicule.Client#getLoue <em>Loue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loue</em>' reference.
	 * @see #getLoue()
	 * @generated
	 */
	void setLoue(Location value);

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference list.
	 * The list contents are of type {@link LocationVehicule.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getClient_Execute()
	 * @model type="LocationVehicule.Transaction" containment="true"
	 * @generated
	 */
	EList getExecute();

	/**
	 * Returns the value of the '<em><b>Est</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Personne#getAgitCommeClient <em>Agit Comme Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est</em>' container reference.
	 * @see #setEst(Personne)
	 * @see LocationVehicule.LocationVehiculePackage#getClient_Est()
	 * @see LocationVehicule.Personne#getAgitCommeClient
	 * @model opposite="agitCommeClient" required="true" transient="false"
	 * @generated
	 */
	Personne getEst();

	/**
	 * Sets the value of the '{@link LocationVehicule.Client#getEst <em>Est</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est</em>' container reference.
	 * @see #getEst()
	 * @generated
	 */
	void setEst(Personne value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MauvaiseExperience listeMauvaisesExperiences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Transaction listeTransactions();

} // Client
