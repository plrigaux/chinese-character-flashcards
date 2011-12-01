/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Commis#getTravailPour <em>Travail Pour</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getCommis()
 * @model
 * @generated
 */
public interface Commis extends EmployeAgence {
	/**
	 * Returns the value of the '<em><b>Travail Pour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Agence#getEstSupporteePar <em>Est Supportee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travail Pour</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travail Pour</em>' container reference.
	 * @see #setTravailPour(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getCommis_TravailPour()
	 * @see LocationVehicule.Agence#getEstSupporteePar
	 * @model opposite="estSupporteePar" required="true" transient="false"
	 * @generated
	 */
	Agence getTravailPour();

	/**
	 * Sets the value of the '{@link LocationVehicule.Commis#getTravailPour <em>Travail Pour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travail Pour</em>' container reference.
	 * @see #getTravailPour()
	 * @generated
	 */
	void setTravailPour(Agence value);

} // Commis
