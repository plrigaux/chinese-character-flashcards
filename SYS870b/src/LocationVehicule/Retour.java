/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Retour#getEstLeProduitDe <em>Est Le Produit De</em>}</li>
 *   <li>{@link LocationVehicule.Retour#getEstRecuePar <em>Est Recue Par</em>}</li>
 *   <li>{@link LocationVehicule.Retour#isVoitureEnBonneCondition <em>Voiture En Bonne Condition</em>}</li>
 *   <li>{@link LocationVehicule.Retour#getMontantPaye <em>Montant Paye</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getRetour()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='statutTermine'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot statutTermine='statut = 1'"
 * @generated
 */
public interface Retour extends Transaction {
	/**
	 * Returns the value of the '<em><b>Est Le Produit De</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Location#getProduit <em>Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Le Produit De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Le Produit De</em>' reference.
	 * @see #setEstLeProduitDe(Location)
	 * @see LocationVehicule.LocationVehiculePackage#getRetour_EstLeProduitDe()
	 * @see LocationVehicule.Location#getProduit
	 * @model opposite="produit"
	 * @generated
	 */
	Location getEstLeProduitDe();

	/**
	 * Sets the value of the '{@link LocationVehicule.Retour#getEstLeProduitDe <em>Est Le Produit De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Le Produit De</em>' reference.
	 * @see #getEstLeProduitDe()
	 * @generated
	 */
	void setEstLeProduitDe(Location value);

	/**
	 * Returns the value of the '<em><b>Est Recue Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceRetour#getRecoit <em>Recoit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Recue Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Recue Par</em>' reference.
	 * @see #setEstRecuePar(AgenceRetour)
	 * @see LocationVehicule.LocationVehiculePackage#getRetour_EstRecuePar()
	 * @see LocationVehicule.AgenceRetour#getRecoit
	 * @model opposite="recoit" required="true"
	 * @generated
	 */
	AgenceRetour getEstRecuePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.Retour#getEstRecuePar <em>Est Recue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Recue Par</em>' reference.
	 * @see #getEstRecuePar()
	 * @generated
	 */
	void setEstRecuePar(AgenceRetour value);

	/**
	 * Returns the value of the '<em><b>Voiture En Bonne Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voiture En Bonne Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voiture En Bonne Condition</em>' attribute.
	 * @see #setVoitureEnBonneCondition(boolean)
	 * @see LocationVehicule.LocationVehiculePackage#getRetour_VoitureEnBonneCondition()
	 * @model
	 * @generated
	 */
	boolean isVoitureEnBonneCondition();

	/**
	 * Sets the value of the '{@link LocationVehicule.Retour#isVoitureEnBonneCondition <em>Voiture En Bonne Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voiture En Bonne Condition</em>' attribute.
	 * @see #isVoitureEnBonneCondition()
	 * @generated
	 */
	void setVoitureEnBonneCondition(boolean value);

	/**
	 * Returns the value of the '<em><b>Montant Paye</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Montant Paye</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montant Paye</em>' attribute.
	 * @see #setMontantPaye(double)
	 * @see LocationVehicule.LocationVehiculePackage#getRetour_MontantPaye()
	 * @model
	 * @generated
	 */
	double getMontantPaye();

	/**
	 * Sets the value of the '{@link LocationVehicule.Retour#getMontantPaye <em>Montant Paye</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Montant Paye</em>' attribute.
	 * @see #getMontantPaye()
	 * @generated
	 */
	void setMontantPaye(double value);

} // Retour
