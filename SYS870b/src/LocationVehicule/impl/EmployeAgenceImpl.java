/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.EmployeAgence;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Personne;
import LocationVehicule.Transaction;

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
 * An implementation of the model object '<em><b>Employe Agence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.EmployeAgenceImpl#getTraite <em>Traite</em>}</li>
 *   <li>{@link LocationVehicule.impl.EmployeAgenceImpl#getEst <em>Est</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EmployeAgenceImpl extends EObjectImpl implements EmployeAgence {
	/**
	 * The cached value of the '{@link #getTraite() <em>Traite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraite()
	 * @generated
	 * @ordered
	 */
	protected EList traite;

	/**
	 * The cached value of the '{@link #getEst() <em>Est</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEst()
	 * @generated
	 * @ordered
	 */
	protected Personne est;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeAgenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.EMPLOYE_AGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTraite() {
		if (traite == null) {
			traite = new EObjectWithInverseResolvingEList(Transaction.class, this, LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE, LocationVehiculePackage.TRANSACTION__EST_TRAITEE_PAR);
		}
		return traite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne getEst() {
		return est;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEst(Personne newEst, NotificationChain msgs) {
		Personne oldEst = est;
		est = newEst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.EMPLOYE_AGENCE__EST, oldEst, newEst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEst(Personne newEst) {
		if (newEst != est) {
			NotificationChain msgs = null;
			if (est != null)
				msgs = ((InternalEObject)est).eInverseRemove(this, LocationVehiculePackage.PERSONNE__EST_EMPLOYE, Personne.class, msgs);
			if (newEst != null)
				msgs = ((InternalEObject)newEst).eInverseAdd(this, LocationVehiculePackage.PERSONNE__EST_EMPLOYE, Personne.class, msgs);
			msgs = basicSetEst(newEst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.EMPLOYE_AGENCE__EST, newEst, newEst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assigneVoitureAReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE:
				return ((InternalEList)getTraite()).basicAdd(otherEnd, msgs);
			case LocationVehiculePackage.EMPLOYE_AGENCE__EST:
				if (est != null)
					msgs = ((InternalEObject)est).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationVehiculePackage.EMPLOYE_AGENCE__EST, null, msgs);
				return basicSetEst((Personne)otherEnd, msgs);
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
			case LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE:
				return ((InternalEList)getTraite()).basicRemove(otherEnd, msgs);
			case LocationVehiculePackage.EMPLOYE_AGENCE__EST:
				return basicSetEst(null, msgs);
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
			case LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE:
				return getTraite();
			case LocationVehiculePackage.EMPLOYE_AGENCE__EST:
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
			case LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE:
				getTraite().clear();
				getTraite().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.EMPLOYE_AGENCE__EST:
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
			case LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE:
				getTraite().clear();
				return;
			case LocationVehiculePackage.EMPLOYE_AGENCE__EST:
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
			case LocationVehiculePackage.EMPLOYE_AGENCE__TRAITE:
				return traite != null && !traite.isEmpty();
			case LocationVehiculePackage.EMPLOYE_AGENCE__EST:
				return est != null;
		}
		return super.eIsSet(featureID);
	}

} //EmployeAgenceImpl
