/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mauvaise Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.MauvaiseExperience#getRelate <em>Relate</em>}</li>
 *   <li>{@link LocationVehicule.MauvaiseExperience#getDetail <em>Detail</em>}</li>
 *   <li>{@link LocationVehicule.MauvaiseExperience#getSeRapporteA <em>Se Rapporte A</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getMauvaiseExperience()
 * @model
 * @generated
 */
public interface MauvaiseExperience extends EObject {
	/**
	 * Returns the value of the '<em><b>Relate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relate</em>' reference.
	 * @see #setRelate(Location)
	 * @see LocationVehicule.LocationVehiculePackage#getMauvaiseExperience_Relate()
	 * @model required="true"
	 * @generated
	 */
	Location getRelate();

	/**
	 * Sets the value of the '{@link LocationVehicule.MauvaiseExperience#getRelate <em>Relate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relate</em>' reference.
	 * @see #getRelate()
	 * @generated
	 */
	void setRelate(Location value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see #setDetail(String)
	 * @see LocationVehicule.LocationVehiculePackage#getMauvaiseExperience_Detail()
	 * @model
	 * @generated
	 */
	String getDetail();

	/**
	 * Sets the value of the '{@link LocationVehicule.MauvaiseExperience#getDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(String value);

	/**
	 * Returns the value of the '<em><b>Se Rapporte A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Rapporte A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Rapporte A</em>' reference.
	 * @see #setSeRapporteA(Transaction)
	 * @see LocationVehicule.LocationVehiculePackage#getMauvaiseExperience_SeRapporteA()
	 * @model required="true"
	 * @generated
	 */
	Transaction getSeRapporteA();

	/**
	 * Sets the value of the '{@link LocationVehicule.MauvaiseExperience#getSeRapporteA <em>Se Rapporte A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se Rapporte A</em>' reference.
	 * @see #getSeRapporteA()
	 * @generated
	 */
	void setSeRapporteA(Transaction value);

} // MauvaiseExperience
