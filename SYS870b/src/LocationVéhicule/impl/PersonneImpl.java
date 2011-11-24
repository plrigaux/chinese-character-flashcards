/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Client;
import LocationVéhicule.Commis;
import LocationVéhicule.Gestionnaire;
import LocationVéhicule.Localisation;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.Personne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.PersonneImpl#getClient <em>Client</em>}</li>
 *   <li>{@link LocationVéhicule.impl.PersonneImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link LocationVéhicule.impl.PersonneImpl#getGestionnaire <em>Gestionnaire</em>}</li>
 *   <li>{@link LocationVéhicule.impl.PersonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVéhicule.impl.PersonneImpl#getPrénom <em>Prénom</em>}</li>
 *   <li>{@link LocationVéhicule.impl.PersonneImpl#getDomicile <em>Domicile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonneImpl extends EObjectImpl implements Personne {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected Commis eReference0;

	/**
	 * The cached value of the '{@link #getGestionnaire() <em>Gestionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Gestionnaire gestionnaire;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrénom() <em>Prénom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrénom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRÉNOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrénom() <em>Prénom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrénom()
	 * @generated
	 * @ordered
	 */
	protected String prénom = PRÉNOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomicile() <em>Domicile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomicile()
	 * @generated
	 * @ordered
	 */
	protected Localisation domicile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.PERSONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Client)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.PERSONNE__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.PERSONNE__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commis getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (Commis)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.PERSONNE__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commis basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(Commis newEReference0) {
		Commis oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.PERSONNE__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire getGestionnaire() {
		if (gestionnaire != null && gestionnaire.eIsProxy()) {
			InternalEObject oldGestionnaire = (InternalEObject)gestionnaire;
			gestionnaire = (Gestionnaire)eResolveProxy(oldGestionnaire);
			if (gestionnaire != oldGestionnaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.PERSONNE__GESTIONNAIRE, oldGestionnaire, gestionnaire));
			}
		}
		return gestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire basicGetGestionnaire() {
		return gestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestionnaire(Gestionnaire newGestionnaire) {
		Gestionnaire oldGestionnaire = gestionnaire;
		gestionnaire = newGestionnaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.PERSONNE__GESTIONNAIRE, oldGestionnaire, gestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.PERSONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrénom() {
		return prénom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrénom(String newPrénom) {
		String oldPrénom = prénom;
		prénom = newPrénom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.PERSONNE__PRÉNOM, oldPrénom, prénom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getDomicile() {
		if (domicile != null && domicile.eIsProxy()) {
			InternalEObject oldDomicile = (InternalEObject)domicile;
			domicile = (Localisation)eResolveProxy(oldDomicile);
			if (domicile != oldDomicile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.PERSONNE__DOMICILE, oldDomicile, domicile));
			}
		}
		return domicile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation basicGetDomicile() {
		return domicile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomicile(Localisation newDomicile) {
		Localisation oldDomicile = domicile;
		domicile = newDomicile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.PERSONNE__DOMICILE, oldDomicile, domicile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.PERSONNE__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case LocationVéhiculePackage.PERSONNE__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case LocationVéhiculePackage.PERSONNE__GESTIONNAIRE:
				if (resolve) return getGestionnaire();
				return basicGetGestionnaire();
			case LocationVéhiculePackage.PERSONNE__NOM:
				return getNom();
			case LocationVéhiculePackage.PERSONNE__PRÉNOM:
				return getPrénom();
			case LocationVéhiculePackage.PERSONNE__DOMICILE:
				if (resolve) return getDomicile();
				return basicGetDomicile();
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
			case LocationVéhiculePackage.PERSONNE__CLIENT:
				setClient((Client)newValue);
				return;
			case LocationVéhiculePackage.PERSONNE__EREFERENCE0:
				setEReference0((Commis)newValue);
				return;
			case LocationVéhiculePackage.PERSONNE__GESTIONNAIRE:
				setGestionnaire((Gestionnaire)newValue);
				return;
			case LocationVéhiculePackage.PERSONNE__NOM:
				setNom((String)newValue);
				return;
			case LocationVéhiculePackage.PERSONNE__PRÉNOM:
				setPrénom((String)newValue);
				return;
			case LocationVéhiculePackage.PERSONNE__DOMICILE:
				setDomicile((Localisation)newValue);
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
			case LocationVéhiculePackage.PERSONNE__CLIENT:
				setClient((Client)null);
				return;
			case LocationVéhiculePackage.PERSONNE__EREFERENCE0:
				setEReference0((Commis)null);
				return;
			case LocationVéhiculePackage.PERSONNE__GESTIONNAIRE:
				setGestionnaire((Gestionnaire)null);
				return;
			case LocationVéhiculePackage.PERSONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LocationVéhiculePackage.PERSONNE__PRÉNOM:
				setPrénom(PRÉNOM_EDEFAULT);
				return;
			case LocationVéhiculePackage.PERSONNE__DOMICILE:
				setDomicile((Localisation)null);
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
			case LocationVéhiculePackage.PERSONNE__CLIENT:
				return client != null;
			case LocationVéhiculePackage.PERSONNE__EREFERENCE0:
				return eReference0 != null;
			case LocationVéhiculePackage.PERSONNE__GESTIONNAIRE:
				return gestionnaire != null;
			case LocationVéhiculePackage.PERSONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LocationVéhiculePackage.PERSONNE__PRÉNOM:
				return PRÉNOM_EDEFAULT == null ? prénom != null : !PRÉNOM_EDEFAULT.equals(prénom);
			case LocationVéhiculePackage.PERSONNE__DOMICILE:
				return domicile != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prénom: ");
		result.append(prénom);
		result.append(')');
		return result.toString();
	}

} //PersonneImpl
