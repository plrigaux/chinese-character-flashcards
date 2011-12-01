/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Gestionnaire#getDirige <em>Dirige</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getGestionnaire()
 * @model
 * @generated
 */
public interface Gestionnaire extends EmployeAgence {
	/**
	 * Returns the value of the '<em><b>Dirige</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Agence#getEstDirigeePar <em>Est Dirigee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirige</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirige</em>' container reference.
	 * @see #setDirige(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getGestionnaire_Dirige()
	 * @see LocationVehicule.Agence#getEstDirigeePar
	 * @model opposite="estDirigeePar" required="true" transient="false"
	 * @generated
	 */
	Agence getDirige();

	/**
	 * Sets the value of the '{@link LocationVehicule.Gestionnaire#getDirige <em>Dirige</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirige</em>' container reference.
	 * @see #getDirige()
	 * @generated
	 */
	void setDirige(Agence value);

} // Gestionnaire
