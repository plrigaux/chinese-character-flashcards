/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Client;
import LocationVehicule.EmployeAgence;
import LocationVehicule.Localisation;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Personne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.PersonneImpl#getAgitCommeClient <em>Agit Comme Client</em>}</li>
 *   <li>{@link LocationVehicule.impl.PersonneImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link LocationVehicule.impl.PersonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVehicule.impl.PersonneImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link LocationVehicule.impl.PersonneImpl#getDomicile <em>Domicile</em>}</li>
 *   <li>{@link LocationVehicule.impl.PersonneImpl#getEstEmploye <em>Est Employe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonneImpl extends EObjectImpl implements Personne {
	/**
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

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
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomicile() <em>Domicile</em>}' containment reference.
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
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.PERSONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getAgitCommeClient() {
		// TODO: implement this method to return the 'Agit Comme Client' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgitCommeClient(Client newAgitCommeClient, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Agit Comme Client' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgitCommeClient(Client newAgitCommeClient) {
		// TODO: implement this method to set the 'Agit Comme Client' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.PERSONNE__IDENTIFIANT, oldIdentifiant, identifiant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.PERSONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.PERSONNE__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getDomicile() {
		return domicile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomicile(Localisation newDomicile, NotificationChain msgs) {
		Localisation oldDomicile = domicile;
		domicile = newDomicile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.PERSONNE__DOMICILE, oldDomicile, newDomicile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomicile(Localisation newDomicile) {
		if (newDomicile != domicile) {
			NotificationChain msgs = null;
			if (domicile != null)
				msgs = ((InternalEObject)domicile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationVehiculePackage.PERSONNE__DOMICILE, null, msgs);
			if (newDomicile != null)
				msgs = ((InternalEObject)newDomicile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocationVehiculePackage.PERSONNE__DOMICILE, null, msgs);
			msgs = basicSetDomicile(newDomicile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.PERSONNE__DOMICILE, newDomicile, newDomicile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeAgence getEstEmploye() {
		if (eContainerFeatureID() != LocationVehiculePackage.PERSONNE__EST_EMPLOYE) return null;
		return (EmployeAgence)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstEmploye(EmployeAgence newEstEmploye, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEstEmploye, LocationVehiculePackage.PERSONNE__EST_EMPLOYE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEmploye(EmployeAgence newEstEmploye) {
		if (newEstEmploye != eInternalContainer() || (eContainerFeatureID() != LocationVehiculePackage.PERSONNE__EST_EMPLOYE && newEstEmploye != null)) {
			if (EcoreUtil.isAncestor(this, newEstEmploye))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEstEmploye != null)
				msgs = ((InternalEObject)newEstEmploye).eInverseAdd(this, LocationVehiculePackage.EMPLOYE_AGENCE__EST, EmployeAgence.class, msgs);
			msgs = basicSetEstEmploye(newEstEmploye, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.PERSONNE__EST_EMPLOYE, newEstEmploye, newEstEmploye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEstEmploye((EmployeAgence)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.PERSONNE__AGIT_COMME_CLIENT:
				return basicSetAgitCommeClient(null, msgs);
			case LocationVehiculePackage.PERSONNE__DOMICILE:
				return basicSetDomicile(null, msgs);
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				return basicSetEstEmploye(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				return eInternalContainer().eInverseRemove(this, LocationVehiculePackage.EMPLOYE_AGENCE__EST, EmployeAgence.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVehiculePackage.PERSONNE__AGIT_COMME_CLIENT:
				return getAgitCommeClient();
			case LocationVehiculePackage.PERSONNE__IDENTIFIANT:
				return getIdentifiant();
			case LocationVehiculePackage.PERSONNE__NOM:
				return getNom();
			case LocationVehiculePackage.PERSONNE__PRENOM:
				return getPrenom();
			case LocationVehiculePackage.PERSONNE__DOMICILE:
				return getDomicile();
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				return getEstEmploye();
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
			case LocationVehiculePackage.PERSONNE__AGIT_COMME_CLIENT:
				setAgitCommeClient((Client)newValue);
				return;
			case LocationVehiculePackage.PERSONNE__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case LocationVehiculePackage.PERSONNE__NOM:
				setNom((String)newValue);
				return;
			case LocationVehiculePackage.PERSONNE__PRENOM:
				setPrenom((String)newValue);
				return;
			case LocationVehiculePackage.PERSONNE__DOMICILE:
				setDomicile((Localisation)newValue);
				return;
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				setEstEmploye((EmployeAgence)newValue);
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
			case LocationVehiculePackage.PERSONNE__AGIT_COMME_CLIENT:
				setAgitCommeClient((Client)null);
				return;
			case LocationVehiculePackage.PERSONNE__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case LocationVehiculePackage.PERSONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LocationVehiculePackage.PERSONNE__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
				return;
			case LocationVehiculePackage.PERSONNE__DOMICILE:
				setDomicile((Localisation)null);
				return;
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				setEstEmploye((EmployeAgence)null);
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
			case LocationVehiculePackage.PERSONNE__AGIT_COMME_CLIENT:
				return getAgitCommeClient() != null;
			case LocationVehiculePackage.PERSONNE__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case LocationVehiculePackage.PERSONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LocationVehiculePackage.PERSONNE__PRENOM:
				return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
			case LocationVehiculePackage.PERSONNE__DOMICILE:
				return domicile != null;
			case LocationVehiculePackage.PERSONNE__EST_EMPLOYE:
				return getEstEmploye() != null;
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
		result.append(" (identifiant: ");
		result.append(identifiant);
		result.append(", nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(')');
		return result.toString();
	}

} //PersonneImpl
