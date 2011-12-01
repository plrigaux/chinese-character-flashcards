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
 * A representation of the model object '<em><b>Agence Transfert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.AgenceTransfert#getTransfereDe <em>Transfere De</em>}</li>
 *   <li>{@link LocationVehicule.AgenceTransfert#getTransfertJouePar <em>Transfert Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getAgenceTransfert()
 * @model
 * @generated
 */
public interface AgenceTransfert extends EObject {
	/**
	 * Returns the value of the '<em><b>Transfere De</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Transfert}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfere De</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfere De</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceTransfert_TransfereDe()
	 * @model type="LocationVehicule.Transfert"
	 * @generated
	 */
	EList getTransfereDe();

	/**
	 * Returns the value of the '<em><b>Transfert Joue Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Agence#getEffectue <em>Effectue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfert Joue Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfert Joue Par</em>' reference.
	 * @see #setTransfertJouePar(Agence)
	 * @see LocationVehicule.LocationVehiculePackage#getAgenceTransfert_TransfertJouePar()
	 * @see LocationVehicule.Agence#getEffectue
	 * @model opposite="effectue" required="true"
	 * @generated
	 */
	Agence getTransfertJouePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.AgenceTransfert#getTransfertJouePar <em>Transfert Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfert Joue Par</em>' reference.
	 * @see #getTransfertJouePar()
	 * @generated
	 */
	void setTransfertJouePar(Agence value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot post_transfertUneVoituredeMoins='self.transfertJouePar.aEnInventaire->size() = self.transfertJouePar.aEnInventaire->size() - 1' post_transfertUneVoituredePlus='agence.aEnInventaire->size() = agence.aEnInventaire->size() + 1' pre_transfertAVoiture='self.transfertJouePar.aEnInventaire->size() > 0'"
	 * @generated
	 */
	void transfereVoiture(Voiture voiture, Agence agence);

} // AgenceTransfert
