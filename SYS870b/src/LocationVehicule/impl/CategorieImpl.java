/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Categorie;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Reservation;
import LocationVehicule.Voiture;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.CategorieImpl#getDemande <em>Demande</em>}</li>
 *   <li>{@link LocationVehicule.impl.CategorieImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVehicule.impl.CategorieImpl#getCategoriseVoiture <em>Categorise Voiture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategorieImpl extends EObjectImpl implements Categorie {
	/**
	 * The cached value of the '{@link #getDemande() <em>Demande</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemande()
	 * @generated
	 * @ordered
	 */
	protected EList demande;

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
	 * The cached value of the '{@link #getCategoriseVoiture() <em>Categorise Voiture</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriseVoiture()
	 * @generated
	 * @ordered
	 */
	protected EList categoriseVoiture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.CATEGORIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDemande() {
		if (demande == null) {
			demande = new EObjectWithInverseResolvingEList(Reservation.class, this, LocationVehiculePackage.CATEGORIE__DEMANDE, LocationVehiculePackage.RESERVATION__DEMANDEE_POUR);
		}
		return demande;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.CATEGORIE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCategoriseVoiture() {
		if (categoriseVoiture == null) {
			categoriseVoiture = new EObjectWithInverseResolvingEList(Voiture.class, this, LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE, LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE);
		}
		return categoriseVoiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.CATEGORIE__DEMANDE:
				return ((InternalEList)getDemande()).basicAdd(otherEnd, msgs);
			case LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE:
				return ((InternalEList)getCategoriseVoiture()).basicAdd(otherEnd, msgs);
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
			case LocationVehiculePackage.CATEGORIE__DEMANDE:
				return ((InternalEList)getDemande()).basicRemove(otherEnd, msgs);
			case LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE:
				return ((InternalEList)getCategoriseVoiture()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVehiculePackage.CATEGORIE__DEMANDE:
				return getDemande();
			case LocationVehiculePackage.CATEGORIE__NOM:
				return getNom();
			case LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE:
				return getCategoriseVoiture();
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
			case LocationVehiculePackage.CATEGORIE__DEMANDE:
				getDemande().clear();
				getDemande().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.CATEGORIE__NOM:
				setNom((String)newValue);
				return;
			case LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE:
				getCategoriseVoiture().clear();
				getCategoriseVoiture().addAll((Collection)newValue);
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
			case LocationVehiculePackage.CATEGORIE__DEMANDE:
				getDemande().clear();
				return;
			case LocationVehiculePackage.CATEGORIE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE:
				getCategoriseVoiture().clear();
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
			case LocationVehiculePackage.CATEGORIE__DEMANDE:
				return demande != null && !demande.isEmpty();
			case LocationVehiculePackage.CATEGORIE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE:
				return categoriseVoiture != null && !categoriseVoiture.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //CategorieImpl
