/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.Gestionnaire;
import LocationVehicule.LocationVehiculePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gestionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.GestionnaireImpl#getDirige <em>Dirige</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GestionnaireImpl extends EmployeAgenceImpl implements Gestionnaire {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.GESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getDirige() {
		if (eContainerFeatureID() != LocationVehiculePackage.GESTIONNAIRE__DIRIGE) return null;
		return (Agence)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirige(Agence newDirige, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDirige, LocationVehiculePackage.GESTIONNAIRE__DIRIGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirige(Agence newDirige) {
		if (newDirige != eInternalContainer() || (eContainerFeatureID() != LocationVehiculePackage.GESTIONNAIRE__DIRIGE && newDirige != null)) {
			if (EcoreUtil.isAncestor(this, newDirige))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDirige != null)
				msgs = ((InternalEObject)newDirige).eInverseAdd(this, LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR, Agence.class, msgs);
			msgs = basicSetDirige(newDirige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.GESTIONNAIRE__DIRIGE, newDirige, newDirige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDirige((Agence)otherEnd, msgs);
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
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				return basicSetDirige(null, msgs);
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
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				return eInternalContainer().eInverseRemove(this, LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR, Agence.class, msgs);
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
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				return getDirige();
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
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				setDirige((Agence)newValue);
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
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				setDirige((Agence)null);
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
			case LocationVehiculePackage.GESTIONNAIRE__DIRIGE:
				return getDirige() != null;
		}
		return super.eIsSet(featureID);
	}

} //GestionnaireImpl
