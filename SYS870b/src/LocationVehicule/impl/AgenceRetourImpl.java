/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.AgenceRetour;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Retour;

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
 * An implementation of the model object '<em><b>Agence Retour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.AgenceRetourImpl#getRecoit <em>Recoit</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceRetourImpl#getRecepteurEstJouePar <em>Recepteur Est Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgenceRetourImpl extends EObjectImpl implements AgenceRetour {
	/**
	 * The cached value of the '{@link #getRecoit() <em>Recoit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoit()
	 * @generated
	 * @ordered
	 */
	protected EList recoit;

	/**
	 * The cached value of the '{@link #getRecepteurEstJouePar() <em>Recepteur Est Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecepteurEstJouePar()
	 * @generated
	 * @ordered
	 */
	protected Agence recepteurEstJouePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceRetourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.AGENCE_RETOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRecoit() {
		if (recoit == null) {
			recoit = new EObjectWithInverseResolvingEList(Retour.class, this, LocationVehiculePackage.AGENCE_RETOUR__RECOIT, LocationVehiculePackage.RETOUR__EST_RECUE_PAR);
		}
		return recoit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getRecepteurEstJouePar() {
		if (recepteurEstJouePar != null && recepteurEstJouePar.eIsProxy()) {
			InternalEObject oldRecepteurEstJouePar = (InternalEObject)recepteurEstJouePar;
			recepteurEstJouePar = (Agence)eResolveProxy(oldRecepteurEstJouePar);
			if (recepteurEstJouePar != oldRecepteurEstJouePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR, oldRecepteurEstJouePar, recepteurEstJouePar));
			}
		}
		return recepteurEstJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetRecepteurEstJouePar() {
		return recepteurEstJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecepteurEstJouePar(Agence newRecepteurEstJouePar, NotificationChain msgs) {
		Agence oldRecepteurEstJouePar = recepteurEstJouePar;
		recepteurEstJouePar = newRecepteurEstJouePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR, oldRecepteurEstJouePar, newRecepteurEstJouePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecepteurEstJouePar(Agence newRecepteurEstJouePar) {
		if (newRecepteurEstJouePar != recepteurEstJouePar) {
			NotificationChain msgs = null;
			if (recepteurEstJouePar != null)
				msgs = ((InternalEObject)recepteurEstJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR, Agence.class, msgs);
			if (newRecepteurEstJouePar != null)
				msgs = ((InternalEObject)newRecepteurEstJouePar).eInverseAdd(this, LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR, Agence.class, msgs);
			msgs = basicSetRecepteurEstJouePar(newRecepteurEstJouePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR, newRecepteurEstJouePar, newRecepteurEstJouePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recoitVoiture() {
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
			case LocationVehiculePackage.AGENCE_RETOUR__RECOIT:
				return ((InternalEList)getRecoit()).basicAdd(otherEnd, msgs);
			case LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR:
				if (recepteurEstJouePar != null)
					msgs = ((InternalEObject)recepteurEstJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR, Agence.class, msgs);
				return basicSetRecepteurEstJouePar((Agence)otherEnd, msgs);
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
			case LocationVehiculePackage.AGENCE_RETOUR__RECOIT:
				return ((InternalEList)getRecoit()).basicRemove(otherEnd, msgs);
			case LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR:
				return basicSetRecepteurEstJouePar(null, msgs);
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
			case LocationVehiculePackage.AGENCE_RETOUR__RECOIT:
				return getRecoit();
			case LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR:
				if (resolve) return getRecepteurEstJouePar();
				return basicGetRecepteurEstJouePar();
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
			case LocationVehiculePackage.AGENCE_RETOUR__RECOIT:
				getRecoit().clear();
				getRecoit().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR:
				setRecepteurEstJouePar((Agence)newValue);
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
			case LocationVehiculePackage.AGENCE_RETOUR__RECOIT:
				getRecoit().clear();
				return;
			case LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR:
				setRecepteurEstJouePar((Agence)null);
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
			case LocationVehiculePackage.AGENCE_RETOUR__RECOIT:
				return recoit != null && !recoit.isEmpty();
			case LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR:
				return recepteurEstJouePar != null;
		}
		return super.eIsSet(featureID);
	}

} //AgenceRetourImpl
