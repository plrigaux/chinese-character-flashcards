/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Transaction#getEstTraiteePar <em>Est Traitee Par</em>}</li>
 *   <li>{@link LocationVehicule.Transaction#getId <em>Id</em>}</li>
 *   <li>{@link LocationVehicule.Transaction#getDateTransaction <em>Date Transaction</em>}</li>
 *   <li>{@link LocationVehicule.Transaction#getAssigne <em>Assigne</em>}</li>
 *   <li>{@link LocationVehicule.Transaction#getStatut <em>Statut</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getTransaction()
 * @model abstract="true"
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Est Traitee Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.EmployeAgence#getTraite <em>Traite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Traitee Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Traitee Par</em>' reference.
	 * @see #setEstTraiteePar(EmployeAgence)
	 * @see LocationVehicule.LocationVehiculePackage#getTransaction_EstTraiteePar()
	 * @see LocationVehicule.EmployeAgence#getTraite
	 * @model opposite="traite" required="true"
	 * @generated
	 */
	EmployeAgence getEstTraiteePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transaction#getEstTraiteePar <em>Est Traitee Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Traitee Par</em>' reference.
	 * @see #getEstTraiteePar()
	 * @generated
	 */
	void setEstTraiteePar(EmployeAgence value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see LocationVehicule.LocationVehiculePackage#getTransaction_Id()
	 * @model
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transaction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Date Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Transaction</em>' attribute.
	 * @see #setDateTransaction(Date)
	 * @see LocationVehicule.LocationVehiculePackage#getTransaction_DateTransaction()
	 * @model
	 * @generated
	 */
	Date getDateTransaction();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transaction#getDateTransaction <em>Date Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Transaction</em>' attribute.
	 * @see #getDateTransaction()
	 * @generated
	 */
	void setDateTransaction(Date value);

	/**
	 * Returns the value of the '<em><b>Assigne</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Voiture#getEstAssigneeA <em>Est Assignee A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigne</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigne</em>' reference.
	 * @see #setAssigne(Voiture)
	 * @see LocationVehicule.LocationVehiculePackage#getTransaction_Assigne()
	 * @see LocationVehicule.Voiture#getEstAssigneeA
	 * @model opposite="estAssigneeA"
	 * @generated
	 */
	Voiture getAssigne();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transaction#getAssigne <em>Assigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigne</em>' reference.
	 * @see #getAssigne()
	 * @generated
	 */
	void setAssigne(Voiture value);

	/**
	 * Returns the value of the '<em><b>Statut</b></em>' attribute.
	 * The literals are from the enumeration {@link LocationVehicule.Statut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut</em>' attribute.
	 * @see LocationVehicule.Statut
	 * @see #setStatut(Statut)
	 * @see LocationVehicule.LocationVehiculePackage#getTransaction_Statut()
	 * @model
	 * @generated
	 */
	Statut getStatut();

	/**
	 * Sets the value of the '{@link LocationVehicule.Transaction#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut</em>' attribute.
	 * @see LocationVehicule.Statut
	 * @see #getStatut()
	 * @generated
	 */
	void setStatut(Statut value);

} // Transaction
