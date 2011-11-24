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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.Location#getA <em>A</em>}</li>
 *   <li>{@link LocationVéhicule.Location#getDateDébut <em>Date Début</em>}</li>
 *   <li>{@link LocationVéhicule.Location#getDateFin <em>Date Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(Voiture)
	 * @see LocationVéhicule.LocationVéhiculePackage#getLocation_A()
	 * @model required="true"
	 * @generated
	 */
	Voiture getA();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Location#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(Voiture value);

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
	 * @see LocationVéhicule.LocationVéhiculePackage#getLocation_DateDébut()
	 * @model
	 * @generated
	 */
	Date getDateDébut();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Location#getDateDébut <em>Date Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Début</em>' attribute.
	 * @see #getDateDébut()
	 * @generated
	 */
	void setDateDébut(Date value);

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
	 * @see LocationVéhicule.LocationVéhiculePackage#getLocation_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link LocationVéhicule.Location#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getPériode();

} // Location
