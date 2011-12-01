/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Client;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.MauvaiseExperience;
import LocationVehicule.Personne;
import LocationVehicule.Reservation;
import LocationVehicule.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.ClientImpl#getPossede <em>Possede</em>}</li>
 *   <li>{@link LocationVehicule.impl.ClientImpl#getLoue <em>Loue</em>}</li>
 *   <li>{@link LocationVehicule.impl.ClientImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link LocationVehicule.impl.ClientImpl#getEst <em>Est</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientImpl extends EObjectImpl implements Client {
	/**
	 * The cached value of the '{@link #getPossede() <em>Possede</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossede()
	 * @generated
	 * @ordered
	 */
	protected EList possede;

	/**
	 * The cached value of the '{@link #getLoue() <em>Loue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoue()
	 * @generated
	 * @ordered
	 */
	protected Location loue;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected EList execute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPossede() {
		if (possede == null) {
			possede = new EObjectResolvingEList(Reservation.class, this, LocationVehiculePackage.CLIENT__POSSEDE);
		}
		return possede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLoue() {
		if (loue != null && loue.eIsProxy()) {
			InternalEObject oldLoue = (InternalEObject)loue;
			loue = (Location)eResolveProxy(oldLoue);
			if (loue != oldLoue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.CLIENT__LOUE, oldLoue, loue));
			}
		}
		return loue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLoue() {
		return loue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoue(Location newLoue) {
		Location oldLoue = loue;
		loue = newLoue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.CLIENT__LOUE, oldLoue, loue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExecute() {
		if (execute == null) {
			execute = new EObjectContainmentEList(Transaction.class, this, LocationVehiculePackage.CLIENT__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne getEst() {
		// TODO: implement this method to return the 'Est' container reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEst(Personne newEst) {
		// TODO: implement this method to set the 'Est' container reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MauvaiseExperience listeMauvaisesExperiences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction listeTransactions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.CLIENT__EXECUTE:
				return ((InternalEList)getExecute()).basicRemove(otherEnd, msgs);
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
			case LocationVehiculePackage.CLIENT__EST:
				return eInternalContainer().eInverseRemove(this, LocationVehiculePackage.PERSONNE__AGIT_COMME_CLIENT, Personne.class, msgs);
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
			case LocationVehiculePackage.CLIENT__POSSEDE:
				return getPossede();
			case LocationVehiculePackage.CLIENT__LOUE:
				if (resolve) return getLoue();
				return basicGetLoue();
			case LocationVehiculePackage.CLIENT__EXECUTE:
				return getExecute();
			case LocationVehiculePackage.CLIENT__EST:
				return getEst();
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
			case LocationVehiculePackage.CLIENT__POSSEDE:
				getPossede().clear();
				getPossede().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.CLIENT__LOUE:
				setLoue((Location)newValue);
				return;
			case LocationVehiculePackage.CLIENT__EXECUTE:
				getExecute().clear();
				getExecute().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.CLIENT__EST:
				setEst((Personne)newValue);
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
			case LocationVehiculePackage.CLIENT__POSSEDE:
				getPossede().clear();
				return;
			case LocationVehiculePackage.CLIENT__LOUE:
				setLoue((Location)null);
				return;
			case LocationVehiculePackage.CLIENT__EXECUTE:
				getExecute().clear();
				return;
			case LocationVehiculePackage.CLIENT__EST:
				setEst((Personne)null);
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
			case LocationVehiculePackage.CLIENT__POSSEDE:
				return possede != null && !possede.isEmpty();
			case LocationVehiculePackage.CLIENT__LOUE:
				return loue != null;
			case LocationVehiculePackage.CLIENT__EXECUTE:
				return execute != null && !execute.isEmpty();
			case LocationVehiculePackage.CLIENT__EST:
				return getEst() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
