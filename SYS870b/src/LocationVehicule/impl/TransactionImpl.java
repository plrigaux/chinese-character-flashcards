/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.EmployeAgence;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Statut;
import LocationVehicule.Transaction;
import LocationVehicule.Voiture;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.TransactionImpl#getEstTraiteePar <em>Est Traitee Par</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransactionImpl#getId <em>Id</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransactionImpl#getDateTransaction <em>Date Transaction</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransactionImpl#getAssigne <em>Assigne</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransactionImpl#getStatut <em>Statut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransactionImpl extends EObjectImpl implements Transaction {
	/**
	 * The cached value of the '{@link #getEstTraiteePar() <em>Est Traitee Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTraiteePar()
	 * @generated
	 * @ordered
	 */
	protected EmployeAgence estTraiteePar;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTransaction() <em>Date Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TRANSACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTransaction() <em>Date Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTransaction()
	 * @generated
	 * @ordered
	 */
	protected Date dateTransaction = DATE_TRANSACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssigne() <em>Assigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigne()
	 * @generated
	 * @ordered
	 */
	protected Voiture assigne;

	/**
	 * The default value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected static final Statut STATUT_EDEFAULT = Statut.EN_COURS_LITERAL;

	/**
	 * The cached value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected Statut statut = STATUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeAgence getEstTraiteePar() {
		if (estTraiteePar != null && estTraiteePar.eIsProxy()) {
			InternalEObject oldEstTraiteePar = (InternalEObject)estTraiteePar;
			estTraiteePar = (EmployeAgence)eResolveProxy(oldEstTraiteePar);
			if (estTraiteePar != oldEstTraiteePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR, oldEstTraiteePar, estTraiteePar));
			}
		}
		return estTraiteePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeAgence basicGetEstTraiteePar() {
		return estTraiteePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTraiteePar(EmployeAgence newEstTraiteePar, NotificationChain msgs) {
		EmployeAgence oldEstTraiteePar = estTraiteePar;
		estTraiteePar = newEstTraiteePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR, oldEstTraiteePar, newEstTraiteePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTraiteePar(EmployeAgence newEstTraiteePar) {
		if (newEstTraiteePar != estTraiteePar) {
			NotificationChain msgs = null;
			if (estTraiteePar != null)
				msgs = ((InternalEObject)estTraiteePar).eInverseRemove(this, LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE, EmployeAgence.class, msgs);
			if (newEstTraiteePar != null)
				msgs = ((InternalEObject)newEstTraiteePar).eInverseAdd(this, LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE, EmployeAgence.class, msgs);
			msgs = basicSetEstTraiteePar(newEstTraiteePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR, newEstTraiteePar, newEstTraiteePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTransaction() {
		return dateTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTransaction(Date newDateTransaction) {
		Date oldDateTransaction = dateTransaction;
		dateTransaction = newDateTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__DATE_TRANSACTION, oldDateTransaction, dateTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getAssigne() {
		if (assigne != null && assigne.eIsProxy()) {
			InternalEObject oldAssigne = (InternalEObject)assigne;
			assigne = (Voiture)eResolveProxy(oldAssigne);
			if (assigne != oldAssigne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.TRANSACTION__ASSIGNE, oldAssigne, assigne));
			}
		}
		return assigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetAssigne() {
		return assigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssigne(Voiture newAssigne, NotificationChain msgs) {
		Voiture oldAssigne = assigne;
		assigne = newAssigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__ASSIGNE, oldAssigne, newAssigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssigne(Voiture newAssigne) {
		if (newAssigne != assigne) {
			NotificationChain msgs = null;
			if (assigne != null)
				msgs = ((InternalEObject)assigne).eInverseRemove(this, LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A, Voiture.class, msgs);
			if (newAssigne != null)
				msgs = ((InternalEObject)newAssigne).eInverseAdd(this, LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A, Voiture.class, msgs);
			msgs = basicSetAssigne(newAssigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__ASSIGNE, newAssigne, newAssigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statut getStatut() {
		return statut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatut(Statut newStatut) {
		Statut oldStatut = statut;
		statut = newStatut == null ? STATUT_EDEFAULT : newStatut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSACTION__STATUT, oldStatut, statut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR:
				if (estTraiteePar != null)
					msgs = ((InternalEObject)estTraiteePar).eInverseRemove(this, LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE, EmployeAgence.class, msgs);
				return basicSetEstTraiteePar((EmployeAgence)otherEnd, msgs);
			case LocationVehiculePackage.TRANSACTION__ASSIGNE:
				if (assigne != null)
					msgs = ((InternalEObject)assigne).eInverseRemove(this, LocationVehiculePackage.VOITURE__EST_ASSIGNEE_A, Voiture.class, msgs);
				return basicSetAssigne((Voiture)otherEnd, msgs);
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
			case LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR:
				return basicSetEstTraiteePar(null, msgs);
			case LocationVehiculePackage.TRANSACTION__ASSIGNE:
				return basicSetAssigne(null, msgs);
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
			case LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR:
				if (resolve) return getEstTraiteePar();
				return basicGetEstTraiteePar();
			case LocationVehiculePackage.TRANSACTION__ID:
				return getId();
			case LocationVehiculePackage.TRANSACTION__DATE_TRANSACTION:
				return getDateTransaction();
			case LocationVehiculePackage.TRANSACTION__ASSIGNE:
				if (resolve) return getAssigne();
				return basicGetAssigne();
			case LocationVehiculePackage.TRANSACTION__STATUT:
				return getStatut();
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
			case LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR:
				setEstTraiteePar((EmployeAgence)newValue);
				return;
			case LocationVehiculePackage.TRANSACTION__ID:
				setId((BigInteger)newValue);
				return;
			case LocationVehiculePackage.TRANSACTION__DATE_TRANSACTION:
				setDateTransaction((Date)newValue);
				return;
			case LocationVehiculePackage.TRANSACTION__ASSIGNE:
				setAssigne((Voiture)newValue);
				return;
			case LocationVehiculePackage.TRANSACTION__STATUT:
				setStatut((Statut)newValue);
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
			case LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR:
				setEstTraiteePar((EmployeAgence)null);
				return;
			case LocationVehiculePackage.TRANSACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case LocationVehiculePackage.TRANSACTION__DATE_TRANSACTION:
				setDateTransaction(DATE_TRANSACTION_EDEFAULT);
				return;
			case LocationVehiculePackage.TRANSACTION__ASSIGNE:
				setAssigne((Voiture)null);
				return;
			case LocationVehiculePackage.TRANSACTION__STATUT:
				setStatut(STATUT_EDEFAULT);
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
			case LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR:
				return estTraiteePar != null;
			case LocationVehiculePackage.TRANSACTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LocationVehiculePackage.TRANSACTION__DATE_TRANSACTION:
				return DATE_TRANSACTION_EDEFAULT == null ? dateTransaction != null : !DATE_TRANSACTION_EDEFAULT.equals(dateTransaction);
			case LocationVehiculePackage.TRANSACTION__ASSIGNE:
				return assigne != null;
			case LocationVehiculePackage.TRANSACTION__STATUT:
				return statut != STATUT_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", dateTransaction: ");
		result.append(dateTransaction);
		result.append(", statut: ");
		result.append(statut);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
