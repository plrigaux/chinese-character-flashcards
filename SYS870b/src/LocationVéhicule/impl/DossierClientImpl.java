/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Client;
import LocationVéhicule.DossierClient;
import LocationVéhicule.Location;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.MauvaiseExpérience;

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
 * An implementation of the model object '<em><b>Dossier Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.DossierClientImpl#getRefère <em>Refère</em>}</li>
 *   <li>{@link LocationVéhicule.impl.DossierClientImpl#getContient <em>Contient</em>}</li>
 *   <li>{@link LocationVéhicule.impl.DossierClientImpl#getRelateHistorique <em>Relate Historique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DossierClientImpl extends EObjectImpl implements DossierClient {
	/**
	 * The cached value of the '{@link #getRefère() <em>Refère</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefère()
	 * @generated
	 * @ordered
	 */
	protected Client refère;

	/**
	 * The cached value of the '{@link #getContient() <em>Contient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContient()
	 * @generated
	 * @ordered
	 */
	protected EList<MauvaiseExpérience> contient;

	/**
	 * The cached value of the '{@link #getRelateHistorique() <em>Relate Historique</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateHistorique()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> relateHistorique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DossierClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.DOSSIER_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getRefère() {
		if (refère != null && refère.eIsProxy()) {
			InternalEObject oldRefère = (InternalEObject)refère;
			refère = (Client)eResolveProxy(oldRefère);
			if (refère != oldRefère) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.DOSSIER_CLIENT__REFÈRE, oldRefère, refère));
			}
		}
		return refère;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetRefère() {
		return refère;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefère(Client newRefère) {
		Client oldRefère = refère;
		refère = newRefère;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.DOSSIER_CLIENT__REFÈRE, oldRefère, refère));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MauvaiseExpérience> getContient() {
		if (contient == null) {
			contient = new EObjectResolvingEList<MauvaiseExpérience>(MauvaiseExpérience.class, this, LocationVéhiculePackage.DOSSIER_CLIENT__CONTIENT);
		}
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getRelateHistorique() {
		if (relateHistorique == null) {
			relateHistorique = new EObjectResolvingEList<Location>(Location.class, this, LocationVéhiculePackage.DOSSIER_CLIENT__RELATE_HISTORIQUE);
		}
		return relateHistorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.DOSSIER_CLIENT__REFÈRE:
				if (resolve) return getRefère();
				return basicGetRefère();
			case LocationVéhiculePackage.DOSSIER_CLIENT__CONTIENT:
				return getContient();
			case LocationVéhiculePackage.DOSSIER_CLIENT__RELATE_HISTORIQUE:
				return getRelateHistorique();
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
			case LocationVéhiculePackage.DOSSIER_CLIENT__REFÈRE:
				setRefère((Client)newValue);
				return;
			case LocationVéhiculePackage.DOSSIER_CLIENT__CONTIENT:
				getContient().clear();
				getContient().addAll((Collection<? extends MauvaiseExpérience>)newValue);
				return;
			case LocationVéhiculePackage.DOSSIER_CLIENT__RELATE_HISTORIQUE:
				getRelateHistorique().clear();
				getRelateHistorique().addAll((Collection<? extends Location>)newValue);
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
			case LocationVéhiculePackage.DOSSIER_CLIENT__REFÈRE:
				setRefère((Client)null);
				return;
			case LocationVéhiculePackage.DOSSIER_CLIENT__CONTIENT:
				getContient().clear();
				return;
			case LocationVéhiculePackage.DOSSIER_CLIENT__RELATE_HISTORIQUE:
				getRelateHistorique().clear();
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
			case LocationVéhiculePackage.DOSSIER_CLIENT__REFÈRE:
				return refère != null;
			case LocationVéhiculePackage.DOSSIER_CLIENT__CONTIENT:
				return contient != null && !contient.isEmpty();
			case LocationVéhiculePackage.DOSSIER_CLIENT__RELATE_HISTORIQUE:
				return relateHistorique != null && !relateHistorique.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DossierClientImpl
