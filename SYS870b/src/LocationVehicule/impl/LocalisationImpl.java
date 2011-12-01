/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Localisation;
import LocationVehicule.LocationVehiculePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.LocalisationImpl#getAdresseCivique <em>Adresse Civique</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocalisationImpl#getVille <em>Ville</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocalisationImpl#getPays <em>Pays</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocalisationImpl#getTelephone <em>Telephone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalisationImpl extends EObjectImpl implements Localisation {
	/**
	 * The default value of the '{@link #getAdresseCivique() <em>Adresse Civique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseCivique()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_CIVIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresseCivique() <em>Adresse Civique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseCivique()
	 * @generated
	 * @ordered
	 */
	protected String adresseCivique = ADRESSE_CIVIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected String ville = VILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPays() <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPays()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPays() <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPays()
	 * @generated
	 * @ordered
	 */
	protected String pays = PAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.LOCALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresseCivique() {
		return adresseCivique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresseCivique(String newAdresseCivique) {
		String oldAdresseCivique = adresseCivique;
		adresseCivique = newAdresseCivique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCALISATION__ADRESSE_CIVIQUE, oldAdresseCivique, adresseCivique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(String newVille) {
		String oldVille = ville;
		ville = newVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCALISATION__VILLE, oldVille, ville));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPays(String newPays) {
		String oldPays = pays;
		pays = newPays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCALISATION__PAYS, oldPays, pays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCALISATION__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVehiculePackage.LOCALISATION__ADRESSE_CIVIQUE:
				return getAdresseCivique();
			case LocationVehiculePackage.LOCALISATION__VILLE:
				return getVille();
			case LocationVehiculePackage.LOCALISATION__PAYS:
				return getPays();
			case LocationVehiculePackage.LOCALISATION__TELEPHONE:
				return getTelephone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationVehiculePackage.LOCALISATION__ADRESSE_CIVIQUE:
				setAdresseCivique((String)newValue);
				return;
			case LocationVehiculePackage.LOCALISATION__VILLE:
				setVille((String)newValue);
				return;
			case LocationVehiculePackage.LOCALISATION__PAYS:
				setPays((String)newValue);
				return;
			case LocationVehiculePackage.LOCALISATION__TELEPHONE:
				setTelephone((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LocationVehiculePackage.LOCALISATION__ADRESSE_CIVIQUE:
				setAdresseCivique(ADRESSE_CIVIQUE_EDEFAULT);
				return;
			case LocationVehiculePackage.LOCALISATION__VILLE:
				setVille(VILLE_EDEFAULT);
				return;
			case LocationVehiculePackage.LOCALISATION__PAYS:
				setPays(PAYS_EDEFAULT);
				return;
			case LocationVehiculePackage.LOCALISATION__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LocationVehiculePackage.LOCALISATION__ADRESSE_CIVIQUE:
				return ADRESSE_CIVIQUE_EDEFAULT == null ? adresseCivique != null : !ADRESSE_CIVIQUE_EDEFAULT.equals(adresseCivique);
			case LocationVehiculePackage.LOCALISATION__VILLE:
				return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
			case LocationVehiculePackage.LOCALISATION__PAYS:
				return PAYS_EDEFAULT == null ? pays != null : !PAYS_EDEFAULT.equals(pays);
			case LocationVehiculePackage.LOCALISATION__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (adresseCivique: ");
		result.append(adresseCivique);
		result.append(", ville: ");
		result.append(ville);
		result.append(", pays: ");
		result.append(pays);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(')');
		return result.toString();
	}

} //LocalisationImpl
