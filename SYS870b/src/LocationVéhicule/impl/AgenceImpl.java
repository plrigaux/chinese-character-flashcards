/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Agence;
import LocationVéhicule.Catégorie;
import LocationVéhicule.Commis;
import LocationVéhicule.Gestionnaire;
import LocationVéhicule.Localisation;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.Voiture;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.AgenceImpl#getPossède <em>Possède</em>}</li>
 *   <li>{@link LocationVéhicule.impl.AgenceImpl#getA <em>A</em>}</li>
 *   <li>{@link LocationVéhicule.impl.AgenceImpl#getEstDirigéPar <em>Est Dirigé Par</em>}</li>
 *   <li>{@link LocationVéhicule.impl.AgenceImpl#getNombreVéhicule <em>Nombre Véhicule</em>}</li>
 *   <li>{@link LocationVéhicule.impl.AgenceImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVéhicule.impl.AgenceImpl#getSeSitue <em>Se Situe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgenceImpl extends EObjectImpl implements Agence {
	/**
	 * The cached value of the '{@link #getPossède() <em>Possède</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossède()
	 * @generated
	 * @ordered
	 */
	protected Voiture possède;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<Commis> a;

	/**
	 * The cached value of the '{@link #getEstDirigéPar() <em>Est Dirigé Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDirigéPar()
	 * @generated
	 * @ordered
	 */
	protected Gestionnaire estDirigéPar;

	/**
	 * The default value of the '{@link #getNombreVéhicule() <em>Nombre Véhicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVéhicule()
	 * @generated
	 * @ordered
	 */
	protected static final int NOMBRE_VÉHICULE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNombreVéhicule() <em>Nombre Véhicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVéhicule()
	 * @generated
	 * @ordered
	 */
	protected int nombreVéhicule = NOMBRE_VÉHICULE_EDEFAULT;

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
	 * The cached value of the '{@link #getSeSitue() <em>Se Situe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeSitue()
	 * @generated
	 * @ordered
	 */
	protected Localisation seSitue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.AGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getPossède() {
		if (possède != null && possède.eIsProxy()) {
			InternalEObject oldPossède = (InternalEObject)possède;
			possède = (Voiture)eResolveProxy(oldPossède);
			if (possède != oldPossède) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.AGENCE__POSSÈDE, oldPossède, possède));
			}
		}
		return possède;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetPossède() {
		return possède;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossède(Voiture newPossède) {
		Voiture oldPossède = possède;
		possède = newPossède;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.AGENCE__POSSÈDE, oldPossède, possède));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commis> getA() {
		if (a == null) {
			a = new EObjectResolvingEList<Commis>(Commis.class, this, LocationVéhiculePackage.AGENCE__A);
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire getEstDirigéPar() {
		if (estDirigéPar != null && estDirigéPar.eIsProxy()) {
			InternalEObject oldEstDirigéPar = (InternalEObject)estDirigéPar;
			estDirigéPar = (Gestionnaire)eResolveProxy(oldEstDirigéPar);
			if (estDirigéPar != oldEstDirigéPar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.AGENCE__EST_DIRIGÉ_PAR, oldEstDirigéPar, estDirigéPar));
			}
		}
		return estDirigéPar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire basicGetEstDirigéPar() {
		return estDirigéPar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDirigéPar(Gestionnaire newEstDirigéPar) {
		Gestionnaire oldEstDirigéPar = estDirigéPar;
		estDirigéPar = newEstDirigéPar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.AGENCE__EST_DIRIGÉ_PAR, oldEstDirigéPar, estDirigéPar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNombreVéhicule() {
		return nombreVéhicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVéhicule(int newNombreVéhicule) {
		int oldNombreVéhicule = nombreVéhicule;
		nombreVéhicule = newNombreVéhicule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.AGENCE__NOMBRE_VÉHICULE, oldNombreVéhicule, nombreVéhicule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.AGENCE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getSeSitue() {
		if (seSitue != null && seSitue.eIsProxy()) {
			InternalEObject oldSeSitue = (InternalEObject)seSitue;
			seSitue = (Localisation)eResolveProxy(oldSeSitue);
			if (seSitue != oldSeSitue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.AGENCE__SE_SITUE, oldSeSitue, seSitue));
			}
		}
		return seSitue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation basicGetSeSitue() {
		return seSitue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeSitue(Localisation newSeSitue) {
		Localisation oldSeSitue = seSitue;
		seSitue = newSeSitue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.AGENCE__SE_SITUE, oldSeSitue, seSitue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean aVoitureDisponible() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void demandeVéhiculeÀAutreAgence() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int nbVoituresDemandés(Catégorie catégorie) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int nbVoituresDisponible(Catégorie catégorie) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transfèreVoiture() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.AGENCE__POSSÈDE:
				if (resolve) return getPossède();
				return basicGetPossède();
			case LocationVéhiculePackage.AGENCE__A:
				return getA();
			case LocationVéhiculePackage.AGENCE__EST_DIRIGÉ_PAR:
				if (resolve) return getEstDirigéPar();
				return basicGetEstDirigéPar();
			case LocationVéhiculePackage.AGENCE__NOMBRE_VÉHICULE:
				return getNombreVéhicule();
			case LocationVéhiculePackage.AGENCE__NOM:
				return getNom();
			case LocationVéhiculePackage.AGENCE__SE_SITUE:
				if (resolve) return getSeSitue();
				return basicGetSeSitue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationVéhiculePackage.AGENCE__POSSÈDE:
				setPossède((Voiture)newValue);
				return;
			case LocationVéhiculePackage.AGENCE__A:
				getA().clear();
				getA().addAll((Collection<? extends Commis>)newValue);
				return;
			case LocationVéhiculePackage.AGENCE__EST_DIRIGÉ_PAR:
				setEstDirigéPar((Gestionnaire)newValue);
				return;
			case LocationVéhiculePackage.AGENCE__NOMBRE_VÉHICULE:
				setNombreVéhicule((Integer)newValue);
				return;
			case LocationVéhiculePackage.AGENCE__NOM:
				setNom((String)newValue);
				return;
			case LocationVéhiculePackage.AGENCE__SE_SITUE:
				setSeSitue((Localisation)newValue);
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
			case LocationVéhiculePackage.AGENCE__POSSÈDE:
				setPossède((Voiture)null);
				return;
			case LocationVéhiculePackage.AGENCE__A:
				getA().clear();
				return;
			case LocationVéhiculePackage.AGENCE__EST_DIRIGÉ_PAR:
				setEstDirigéPar((Gestionnaire)null);
				return;
			case LocationVéhiculePackage.AGENCE__NOMBRE_VÉHICULE:
				setNombreVéhicule(NOMBRE_VÉHICULE_EDEFAULT);
				return;
			case LocationVéhiculePackage.AGENCE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LocationVéhiculePackage.AGENCE__SE_SITUE:
				setSeSitue((Localisation)null);
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
			case LocationVéhiculePackage.AGENCE__POSSÈDE:
				return possède != null;
			case LocationVéhiculePackage.AGENCE__A:
				return a != null && !a.isEmpty();
			case LocationVéhiculePackage.AGENCE__EST_DIRIGÉ_PAR:
				return estDirigéPar != null;
			case LocationVéhiculePackage.AGENCE__NOMBRE_VÉHICULE:
				return nombreVéhicule != NOMBRE_VÉHICULE_EDEFAULT;
			case LocationVéhiculePackage.AGENCE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LocationVéhiculePackage.AGENCE__SE_SITUE:
				return seSitue != null;
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
		result.append(" (nombreVéhicule: ");
		result.append(nombreVéhicule);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //AgenceImpl
