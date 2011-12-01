/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Statut</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see LocationVehicule.LocationVehiculePackage#getStatut()
 * @model
 * @generated
 */
public final class Statut extends AbstractEnumerator {
	/**
	 * The '<em><b>En Cours</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>En Cours</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN_COURS_LITERAL
	 * @model name="EnCours"
	 * @generated
	 * @ordered
	 */
	public static final int EN_COURS = 0;

	/**
	 * The '<em><b>Terminee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINEE_LITERAL
	 * @model name="Terminee"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINEE = 1;

	/**
	 * The '<em><b>Annulee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Annulee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANNULEE_LITERAL
	 * @model name="Annulee"
	 * @generated
	 * @ordered
	 */
	public static final int ANNULEE = 2;

	/**
	 * The '<em><b>En Cours</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_COURS
	 * @generated
	 * @ordered
	 */
	public static final Statut EN_COURS_LITERAL = new Statut(EN_COURS, "EnCours", "EnCours");

	/**
	 * The '<em><b>Terminee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINEE
	 * @generated
	 * @ordered
	 */
	public static final Statut TERMINEE_LITERAL = new Statut(TERMINEE, "Terminee", "Terminee");

	/**
	 * The '<em><b>Annulee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNULEE
	 * @generated
	 * @ordered
	 */
	public static final Statut ANNULEE_LITERAL = new Statut(ANNULEE, "Annulee", "Annulee");

	/**
	 * An array of all the '<em><b>Statut</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Statut[] VALUES_ARRAY =
		new Statut[] {
			EN_COURS_LITERAL,
			TERMINEE_LITERAL,
			ANNULEE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Statut</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Statut</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Statut get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Statut result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statut</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Statut getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Statut result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statut</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Statut get(int value) {
		switch (value) {
			case EN_COURS: return EN_COURS_LITERAL;
			case TERMINEE: return TERMINEE_LITERAL;
			case ANNULEE: return ANNULEE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Statut(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Statut
