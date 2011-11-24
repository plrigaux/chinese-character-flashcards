/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Catégorie;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.Réservation;
import LocationVéhicule.Voiture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.VoitureImpl#getEstClassé <em>Est Classé</em>}</li>
 *   <li>{@link LocationVéhicule.impl.VoitureImpl#getEstAssigné <em>Est Assigné</em>}</li>
 *   <li>{@link LocationVéhicule.impl.VoitureImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoitureImpl extends EObjectImpl implements Voiture {
	/**
	 * The cached value of the '{@link #getEstClassé() <em>Est Classé</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstClassé()
	 * @generated
	 * @ordered
	 */
	protected Catégorie estClassé;

	/**
	 * The cached value of the '{@link #getEstAssigné() <em>Est Assigné</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssigné()
	 * @generated
	 * @ordered
	 */
	protected Réservation estAssigné;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.VOITURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catégorie getEstClassé() {
		if (estClassé != null && estClassé.eIsProxy()) {
			InternalEObject oldEstClassé = (InternalEObject)estClassé;
			estClassé = (Catégorie)eResolveProxy(oldEstClassé);
			if (estClassé != oldEstClassé) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.VOITURE__EST_CLASSÉ, oldEstClassé, estClassé));
			}
		}
		return estClassé;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catégorie basicGetEstClassé() {
		return estClassé;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstClassé(Catégorie newEstClassé) {
		Catégorie oldEstClassé = estClassé;
		estClassé = newEstClassé;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.VOITURE__EST_CLASSÉ, oldEstClassé, estClassé));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Réservation getEstAssigné() {
		if (estAssigné != null && estAssigné.eIsProxy()) {
			InternalEObject oldEstAssigné = (InternalEObject)estAssigné;
			estAssigné = (Réservation)eResolveProxy(oldEstAssigné);
			if (estAssigné != oldEstAssigné) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.VOITURE__EST_ASSIGNÉ, oldEstAssigné, estAssigné));
			}
		}
		return estAssigné;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Réservation basicGetEstAssigné() {
		return estAssigné;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAssigné(Réservation newEstAssigné) {
		Réservation oldEstAssigné = estAssigné;
		estAssigné = newEstAssigné;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.VOITURE__EST_ASSIGNÉ, oldEstAssigné, estAssigné));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.VOITURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.VOITURE__EST_CLASSÉ:
				if (resolve) return getEstClassé();
				return basicGetEstClassé();
			case LocationVéhiculePackage.VOITURE__EST_ASSIGNÉ:
				if (resolve) return getEstAssigné();
				return basicGetEstAssigné();
			case LocationVéhiculePackage.VOITURE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationVéhiculePackage.VOITURE__EST_CLASSÉ:
				setEstClassé((Catégorie)newValue);
				return;
			case LocationVéhiculePackage.VOITURE__EST_ASSIGNÉ:
				setEstAssigné((Réservation)newValue);
				return;
			case LocationVéhiculePackage.VOITURE__ID:
				setId((String)newValue);
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
			case LocationVéhiculePackage.VOITURE__EST_CLASSÉ:
				setEstClassé((Catégorie)null);
				return;
			case LocationVéhiculePackage.VOITURE__EST_ASSIGNÉ:
				setEstAssigné((Réservation)null);
				return;
			case LocationVéhiculePackage.VOITURE__ID:
				setId(ID_EDEFAULT);
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
			case LocationVéhiculePackage.VOITURE__EST_CLASSÉ:
				return estClassé != null;
			case LocationVéhiculePackage.VOITURE__EST_ASSIGNÉ:
				return estAssigné != null;
			case LocationVéhiculePackage.VOITURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //VoitureImpl
