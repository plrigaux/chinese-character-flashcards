/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.AgenceTransfert;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Transfert;
import LocationVehicule.Voiture;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agence Transfert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.AgenceTransfertImpl#getTransfereDe <em>Transfere De</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceTransfertImpl#getTransfertJouePar <em>Transfert Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgenceTransfertImpl extends EObjectImpl implements AgenceTransfert {
	/**
	 * The cached value of the '{@link #getTransfereDe() <em>Transfere De</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfereDe()
	 * @generated
	 * @ordered
	 */
	protected EList transfereDe;

	/**
	 * The cached value of the '{@link #getTransfertJouePar() <em>Transfert Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfertJouePar()
	 * @generated
	 * @ordered
	 */
	protected Agence transfertJouePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceTransfertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.AGENCE_TRANSFERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransfereDe() {
		if (transfereDe == null) {
			transfereDe = new EObjectResolvingEList(Transfert.class, this, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERE_DE);
		}
		return transfereDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getTransfertJouePar() {
		if (transfertJouePar != null && transfertJouePar.eIsProxy()) {
			InternalEObject oldTransfertJouePar = (InternalEObject)transfertJouePar;
			transfertJouePar = (Agence)eResolveProxy(oldTransfertJouePar);
			if (transfertJouePar != oldTransfertJouePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR, oldTransfertJouePar, transfertJouePar));
			}
		}
		return transfertJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetTransfertJouePar() {
		return transfertJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransfertJouePar(Agence newTransfertJouePar, NotificationChain msgs) {
		Agence oldTransfertJouePar = transfertJouePar;
		transfertJouePar = newTransfertJouePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR, oldTransfertJouePar, newTransfertJouePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfertJouePar(Agence newTransfertJouePar) {
		if (newTransfertJouePar != transfertJouePar) {
			NotificationChain msgs = null;
			if (transfertJouePar != null)
				msgs = ((InternalEObject)transfertJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__EFFECTUE, Agence.class, msgs);
			if (newTransfertJouePar != null)
				msgs = ((InternalEObject)newTransfertJouePar).eInverseAdd(this, LocationVehiculePackage.AGENCE__EFFECTUE, Agence.class, msgs);
			msgs = basicSetTransfertJouePar(newTransfertJouePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR, newTransfertJouePar, newTransfertJouePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transfereVoiture(Voiture voiture, Agence agence) {
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
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR:
				if (transfertJouePar != null)
					msgs = ((InternalEObject)transfertJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__EFFECTUE, Agence.class, msgs);
				return basicSetTransfertJouePar((Agence)otherEnd, msgs);
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
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR:
				return basicSetTransfertJouePar(null, msgs);
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
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERE_DE:
				return getTransfereDe();
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR:
				if (resolve) return getTransfertJouePar();
				return basicGetTransfertJouePar();
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
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERE_DE:
				getTransfereDe().clear();
				getTransfereDe().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR:
				setTransfertJouePar((Agence)newValue);
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
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERE_DE:
				getTransfereDe().clear();
				return;
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR:
				setTransfertJouePar((Agence)null);
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
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERE_DE:
				return transfereDe != null && !transfereDe.isEmpty();
			case LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR:
				return transfertJouePar != null;
		}
		return super.eIsSet(featureID);
	}

} //AgenceTransfertImpl
