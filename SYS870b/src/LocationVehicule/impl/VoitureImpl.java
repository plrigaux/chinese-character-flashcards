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
import LocationVehicule.Transaction;
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
 * An implementation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.VoitureImpl#getEstDeCategorie <em>Est De Categorie</em>}</li>
 *   <li>{@link LocationVehicule.impl.VoitureImpl#getEstAssigne <em>Est Assigne</em>}</li>
 *   <li>{@link LocationVehicule.impl.VoitureImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link LocationVehicule.impl.VoitureImpl#getEstAssigneeA <em>Est Assignee A</em>}</li>
 *   <li>{@link LocationVehicule.impl.VoitureImpl#isEnReparation <em>En Reparation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoitureImpl extends EObjectImpl implements Voiture {
	/**
	 * The cached value of the '{@link #getEstDeCategorie() <em>Est De Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDeCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie estDeCategorie;

	/**
	 * The cached value of the '{@link #getEstAssigne() <em>Est Assigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssigne()
	 * @generated
	 * @ordered
	 */
	protected Reservation estAssigne;

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
	 * The cached value of the '{@link #getEstAssigneeA() <em>Est Assignee A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssigneeA()
	 * @generated
	 * @ordered
	 */
	protected EList estAssigneeA;

	/**
	 * The default value of the '{@link #isEnReparation() <em>En Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnReparation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EN_REPARATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnReparation() <em>En Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnReparation()
	 * @generated
	 * @ordered
	 */
	protected boolean enReparation = EN_REPARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoitureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.VOITURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getEstDeCategorie() {
		if (estDeCategorie != null && estDeCategorie.eIsProxy()) {
			InternalEObject oldEstDeCategorie = (InternalEObject)estDeCategorie;
			estDeCategorie = (Categorie)eResolveProxy(oldEstDeCategorie);
			if (estDeCategorie != oldEstDeCategorie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE, oldEstDeCategorie, estDeCategorie));
			}
		}
		return estDeCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie basicGetEstDeCategorie() {
		return estDeCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDeCategorie(Categorie newEstDeCategorie, NotificationChain msgs) {
		Categorie oldEstDeCategorie = estDeCategorie;
		estDeCategorie = newEstDeCategorie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE, oldEstDeCategorie, newEstDeCategorie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDeCategorie(Categorie newEstDeCategorie) {
		if (newEstDeCategorie != estDeCategorie) {
			NotificationChain msgs = null;
			if (estDeCategorie != null)
				msgs = ((InternalEObject)estDeCategorie).eInverseRemove(this, LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE, Categorie.class, msgs);
			if (newEstDeCategorie != null)
				msgs = ((InternalEObject)newEstDeCategorie).eInverseAdd(this, LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE, Categorie.class, msgs);
			msgs = basicSetEstDeCategorie(newEstDeCategorie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE, newEstDeCategorie, newEstDeCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getEstAssigne() {
		if (estAssigne != null && estAssigne.eIsProxy()) {
			InternalEObject oldEstAssigne = (InternalEObject)estAssigne;
			estAssigne = (Reservation)eResolveProxy(oldEstAssigne);
			if (estAssigne != oldEstAssigne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.VOITURE__EST_ASSIGNE, oldEstAssigne, estAssigne));
			}
		}
		return estAssigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetEstAssigne() {
		return estAssigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAssigne(Reservation newEstAssigne) {
		Reservation oldEstAssigne = estAssigne;
		estAssigne = newEstAssigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.VOITURE__EST_ASSIGNE, oldEstAssigne, estAssigne));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.VOITURE__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstAssigneeA() {
		if (estAssigneeA == null) {
			estAssigneeA = new EObjectWithInverseResolvingEList(Transaction.class, this, LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A, LocationVehiculePackage.TRANSACTION__ASSIGNE);
		}
		return estAssigneeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnReparation() {
		return enReparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnReparation(boolean newEnReparation) {
		boolean oldEnReparation = enReparation;
		enReparation = newEnReparation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.VOITURE__EN_REPARATION, oldEnReparation, enReparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE:
				if (estDeCategorie != null)
					msgs = ((InternalEObject)estDeCategorie).eInverseRemove(this, LocationVehiculePackage.CATEGORIE__CATEGORISE_VOITURE, Categorie.class, msgs);
				return basicSetEstDeCategorie((Categorie)otherEnd, msgs);
			case LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A:
				return ((InternalEList)getEstAssigneeA()).basicAdd(otherEnd, msgs);
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
			case LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE:
				return basicSetEstDeCategorie(null, msgs);
			case LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A:
				return ((InternalEList)getEstAssigneeA()).basicRemove(otherEnd, msgs);
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
			case LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE:
				if (resolve) return getEstDeCategorie();
				return basicGetEstDeCategorie();
			case LocationVehiculePackage.VOITURE__EST_ASSIGNE:
				if (resolve) return getEstAssigne();
				return basicGetEstAssigne();
			case LocationVehiculePackage.VOITURE__IDENTIFIANT:
				return getIdentifiant();
			case LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A:
				return getEstAssigneeA();
			case LocationVehiculePackage.VOITURE__EN_REPARATION:
				return isEnReparation() ? Boolean.TRUE : Boolean.FALSE;
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
			case LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE:
				setEstDeCategorie((Categorie)newValue);
				return;
			case LocationVehiculePackage.VOITURE__EST_ASSIGNE:
				setEstAssigne((Reservation)newValue);
				return;
			case LocationVehiculePackage.VOITURE__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A:
				getEstAssigneeA().clear();
				getEstAssigneeA().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.VOITURE__EN_REPARATION:
				setEnReparation(((Boolean)newValue).booleanValue());
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
			case LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE:
				setEstDeCategorie((Categorie)null);
				return;
			case LocationVehiculePackage.VOITURE__EST_ASSIGNE:
				setEstAssigne((Reservation)null);
				return;
			case LocationVehiculePackage.VOITURE__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A:
				getEstAssigneeA().clear();
				return;
			case LocationVehiculePackage.VOITURE__EN_REPARATION:
				setEnReparation(EN_REPARATION_EDEFAULT);
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
			case LocationVehiculePackage.VOITURE__EST_DE_CATEGORIE:
				return estDeCategorie != null;
			case LocationVehiculePackage.VOITURE__EST_ASSIGNE:
				return estAssigne != null;
			case LocationVehiculePackage.VOITURE__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A:
				return estAssigneeA != null && !estAssigneeA.isEmpty();
			case LocationVehiculePackage.VOITURE__EN_REPARATION:
				return enReparation != EN_REPARATION_EDEFAULT;
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
		result.append(", enReparation: ");
		result.append(enReparation);
		result.append(')');
		return result.toString();
	}

} //VoitureImpl
