/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Localisation;
import LocationVéhicule.LocationVéhiculePackage;

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
 *   <li>{@link LocationVéhicule.impl.LocalisationImpl#getVille <em>Ville</em>}</li>
 *   <li>{@link LocationVéhicule.impl.LocalisationImpl#getPays <em>Pays</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalisationImpl extends EObjectImpl implements Localisation {
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
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.LOCALISATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.LOCALISATION__VILLE, oldVille, ville));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.LOCALISATION__PAYS, oldPays, pays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.LOCALISATION__VILLE:
				return getVille();
			case LocationVéhiculePackage.LOCALISATION__PAYS:
				return getPays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationVéhiculePackage.LOCALISATION__VILLE:
				setVille((String)newValue);
				return;
			case LocationVéhiculePackage.LOCALISATION__PAYS:
				setPays((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LocationVéhiculePackage.LOCALISATION__VILLE:
				setVille(VILLE_EDEFAULT);
				return;
			case LocationVéhiculePackage.LOCALISATION__PAYS:
				setPays(PAYS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LocationVéhiculePackage.LOCALISATION__VILLE:
				return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
			case LocationVéhiculePackage.LOCALISATION__PAYS:
				return PAYS_EDEFAULT == null ? pays != null : !PAYS_EDEFAULT.equals(pays);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ville: ");
		result.append(ville);
		result.append(", pays: ");
		result.append(pays);
		result.append(')');
		return result.toString();
	}

} //LocalisationImpl
