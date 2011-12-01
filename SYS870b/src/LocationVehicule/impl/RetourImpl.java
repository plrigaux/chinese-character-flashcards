/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.AgenceRetour;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Retour;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.RetourImpl#getEstLeProduitDe <em>Est Le Produit De</em>}</li>
 *   <li>{@link LocationVehicule.impl.RetourImpl#getEstRecuePar <em>Est Recue Par</em>}</li>
 *   <li>{@link LocationVehicule.impl.RetourImpl#isVoitureEnBonneCondition <em>Voiture En Bonne Condition</em>}</li>
 *   <li>{@link LocationVehicule.impl.RetourImpl#getMontantPaye <em>Montant Paye</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RetourImpl extends TransactionImpl implements Retour {
	/**
	 * The cached value of the '{@link #getEstLeProduitDe() <em>Est Le Produit De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLeProduitDe()
	 * @generated
	 * @ordered
	 */
	protected Location estLeProduitDe;

	/**
	 * The cached value of the '{@link #getEstRecuePar() <em>Est Recue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRecuePar()
	 * @generated
	 * @ordered
	 */
	protected AgenceRetour estRecuePar;

	/**
	 * The default value of the '{@link #isVoitureEnBonneCondition() <em>Voiture En Bonne Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVoitureEnBonneCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOITURE_EN_BONNE_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVoitureEnBonneCondition() <em>Voiture En Bonne Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVoitureEnBonneCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean voitureEnBonneCondition = VOITURE_EN_BONNE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMontantPaye() <em>Montant Paye</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontantPaye()
	 * @generated
	 * @ordered
	 */
	protected static final double MONTANT_PAYE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMontantPaye() <em>Montant Paye</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontantPaye()
	 * @generated
	 * @ordered
	 */
	protected double montantPaye = MONTANT_PAYE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.RETOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getEstLeProduitDe() {
		if (estLeProduitDe != null && estLeProduitDe.eIsProxy()) {
			InternalEObject oldEstLeProduitDe = (InternalEObject)estLeProduitDe;
			estLeProduitDe = (Location)eResolveProxy(oldEstLeProduitDe);
			if (estLeProduitDe != oldEstLeProduitDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE, oldEstLeProduitDe, estLeProduitDe));
			}
		}
		return estLeProduitDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetEstLeProduitDe() {
		return estLeProduitDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLeProduitDe(Location newEstLeProduitDe, NotificationChain msgs) {
		Location oldEstLeProduitDe = estLeProduitDe;
		estLeProduitDe = newEstLeProduitDe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE, oldEstLeProduitDe, newEstLeProduitDe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLeProduitDe(Location newEstLeProduitDe) {
		if (newEstLeProduitDe != estLeProduitDe) {
			NotificationChain msgs = null;
			if (estLeProduitDe != null)
				msgs = ((InternalEObject)estLeProduitDe).eInverseRemove(this, LocationVehiculePackage.LOCATION__PRODUIT, Location.class, msgs);
			if (newEstLeProduitDe != null)
				msgs = ((InternalEObject)newEstLeProduitDe).eInverseAdd(this, LocationVehiculePackage.LOCATION__PRODUIT, Location.class, msgs);
			msgs = basicSetEstLeProduitDe(newEstLeProduitDe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE, newEstLeProduitDe, newEstLeProduitDe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceRetour getEstRecuePar() {
		if (estRecuePar != null && estRecuePar.eIsProxy()) {
			InternalEObject oldEstRecuePar = (InternalEObject)estRecuePar;
			estRecuePar = (AgenceRetour)eResolveProxy(oldEstRecuePar);
			if (estRecuePar != oldEstRecuePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RETOUR__EST_RECUE_PAR, oldEstRecuePar, estRecuePar));
			}
		}
		return estRecuePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceRetour basicGetEstRecuePar() {
		return estRecuePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRecuePar(AgenceRetour newEstRecuePar, NotificationChain msgs) {
		AgenceRetour oldEstRecuePar = estRecuePar;
		estRecuePar = newEstRecuePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RETOUR__EST_RECUE_PAR, oldEstRecuePar, newEstRecuePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRecuePar(AgenceRetour newEstRecuePar) {
		if (newEstRecuePar != estRecuePar) {
			NotificationChain msgs = null;
			if (estRecuePar != null)
				msgs = ((InternalEObject)estRecuePar).eInverseRemove(this, LocationVehiculePackage.AGENCE_RETOUR__RECOIT, AgenceRetour.class, msgs);
			if (newEstRecuePar != null)
				msgs = ((InternalEObject)newEstRecuePar).eInverseAdd(this, LocationVehiculePackage.AGENCE_RETOUR__RECOIT, AgenceRetour.class, msgs);
			msgs = basicSetEstRecuePar(newEstRecuePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RETOUR__EST_RECUE_PAR, newEstRecuePar, newEstRecuePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVoitureEnBonneCondition() {
		return voitureEnBonneCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoitureEnBonneCondition(boolean newVoitureEnBonneCondition) {
		boolean oldVoitureEnBonneCondition = voitureEnBonneCondition;
		voitureEnBonneCondition = newVoitureEnBonneCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RETOUR__VOITURE_EN_BONNE_CONDITION, oldVoitureEnBonneCondition, voitureEnBonneCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMontantPaye() {
		return montantPaye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMontantPaye(double newMontantPaye) {
		double oldMontantPaye = montantPaye;
		montantPaye = newMontantPaye;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RETOUR__MONTANT_PAYE, oldMontantPaye, montantPaye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE:
				if (estLeProduitDe != null)
					msgs = ((InternalEObject)estLeProduitDe).eInverseRemove(this, LocationVehiculePackage.LOCATION__PRODUIT, Location.class, msgs);
				return basicSetEstLeProduitDe((Location)otherEnd, msgs);
			case LocationVehiculePackage.RETOUR__EST_RECUE_PAR:
				if (estRecuePar != null)
					msgs = ((InternalEObject)estRecuePar).eInverseRemove(this, LocationVehiculePackage.AGENCE_RETOUR__RECOIT, AgenceRetour.class, msgs);
				return basicSetEstRecuePar((AgenceRetour)otherEnd, msgs);
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
			case LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE:
				return basicSetEstLeProduitDe(null, msgs);
			case LocationVehiculePackage.RETOUR__EST_RECUE_PAR:
				return basicSetEstRecuePar(null, msgs);
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
			case LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE:
				if (resolve) return getEstLeProduitDe();
				return basicGetEstLeProduitDe();
			case LocationVehiculePackage.RETOUR__EST_RECUE_PAR:
				if (resolve) return getEstRecuePar();
				return basicGetEstRecuePar();
			case LocationVehiculePackage.RETOUR__VOITURE_EN_BONNE_CONDITION:
				return isVoitureEnBonneCondition() ? Boolean.TRUE : Boolean.FALSE;
			case LocationVehiculePackage.RETOUR__MONTANT_PAYE:
				return new Double(getMontantPaye());
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
			case LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE:
				setEstLeProduitDe((Location)newValue);
				return;
			case LocationVehiculePackage.RETOUR__EST_RECUE_PAR:
				setEstRecuePar((AgenceRetour)newValue);
				return;
			case LocationVehiculePackage.RETOUR__VOITURE_EN_BONNE_CONDITION:
				setVoitureEnBonneCondition(((Boolean)newValue).booleanValue());
				return;
			case LocationVehiculePackage.RETOUR__MONTANT_PAYE:
				setMontantPaye(((Double)newValue).doubleValue());
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
			case LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE:
				setEstLeProduitDe((Location)null);
				return;
			case LocationVehiculePackage.RETOUR__EST_RECUE_PAR:
				setEstRecuePar((AgenceRetour)null);
				return;
			case LocationVehiculePackage.RETOUR__VOITURE_EN_BONNE_CONDITION:
				setVoitureEnBonneCondition(VOITURE_EN_BONNE_CONDITION_EDEFAULT);
				return;
			case LocationVehiculePackage.RETOUR__MONTANT_PAYE:
				setMontantPaye(MONTANT_PAYE_EDEFAULT);
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
			case LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE:
				return estLeProduitDe != null;
			case LocationVehiculePackage.RETOUR__EST_RECUE_PAR:
				return estRecuePar != null;
			case LocationVehiculePackage.RETOUR__VOITURE_EN_BONNE_CONDITION:
				return voitureEnBonneCondition != VOITURE_EN_BONNE_CONDITION_EDEFAULT;
			case LocationVehiculePackage.RETOUR__MONTANT_PAYE:
				return montantPaye != MONTANT_PAYE_EDEFAULT;
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
		result.append(" (voitureEnBonneCondition: ");
		result.append(voitureEnBonneCondition);
		result.append(", montantPaye: ");
		result.append(montantPaye);
		result.append(')');
		return result.toString();
	}

} //RetourImpl
