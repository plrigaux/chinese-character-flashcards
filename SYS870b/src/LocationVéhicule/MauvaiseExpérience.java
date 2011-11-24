/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mauvaise Expérience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVéhicule.MauvaiseExpérience#getRelate <em>Relate</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVéhicule.LocationVéhiculePackage#getMauvaiseExpérience()
 * @model
 * @generated
 */
public interface MauvaiseExpérience extends EObject {
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
	 * @see LocationVéhicule.LocationVéhiculePackage#getMauvaiseExpérience_Relate()
	 * @model required="true"
	 * @generated
	 */
	Location getRelate();

	/**
	 * Sets the value of the '{@link LocationVéhicule.MauvaiseExpérience#getRelate <em>Relate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relate</em>' reference.
	 * @see #getRelate()
	 * @generated
	 */
	void setRelate(Location value);

} // MauvaiseExpérience
