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

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Réservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.RéservationImpl#getRéfère <em>Réfère</em>}</li>
 *   <li>{@link LocationVéhicule.impl.RéservationImpl#getDateDébut <em>Date Début</em>}</li>
 *   <li>{@link LocationVéhicule.impl.RéservationImpl#getCatégorie <em>Catégorie</em>}</li>
 *   <li>{@link LocationVéhicule.impl.RéservationImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link LocationVéhicule.impl.RéservationImpl#isPréalable <em>Préalable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RéservationImpl extends EObjectImpl implements Réservation {
	/**
	 * The cached value of the '{@link #getRéfère() <em>Réfère</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRéfère()
	 * @generated
	 * @ordered
	 */
	protected Voiture réfère;

	/**
	 * The default value of the '{@link #getDateDébut() <em>Date Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDébut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DÉBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDébut() <em>Date Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDébut()
	 * @generated
	 * @ordered
	 */
	protected Date dateDébut = DATE_DÉBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCatégorie() <em>Catégorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatégorie()
	 * @generated
	 * @ordered
	 */
	protected Catégorie catégorie;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected Date dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isPréalable() <em>Préalable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPréalable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRÉALABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPréalable() <em>Préalable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPréalable()
	 * @generated
	 * @ordered
	 */
	protected boolean préalable = PRÉALABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RéservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.RÉSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getRéfère() {
		if (réfère != null && réfère.eIsProxy()) {
			InternalEObject oldRéfère = (InternalEObject)réfère;
			réfère = (Voiture)eResolveProxy(oldRéfère);
			if (réfère != oldRéfère) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.RÉSERVATION__RÉFÈRE, oldRéfère, réfère));
			}
		}
		return réfère;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetRéfère() {
		return réfère;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRéfère(Voiture newRéfère) {
		Voiture oldRéfère = réfère;
		réfère = newRéfère;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.RÉSERVATION__RÉFÈRE, oldRéfère, réfère));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDébut() {
		return dateDébut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDébut(Date newDateDébut) {
		Date oldDateDébut = dateDébut;
		dateDébut = newDateDébut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.RÉSERVATION__DATE_DÉBUT, oldDateDébut, dateDébut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catégorie getCatégorie() {
		if (catégorie != null && catégorie.eIsProxy()) {
			InternalEObject oldCatégorie = (InternalEObject)catégorie;
			catégorie = (Catégorie)eResolveProxy(oldCatégorie);
			if (catégorie != oldCatégorie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.RÉSERVATION__CATÉGORIE, oldCatégorie, catégorie));
			}
		}
		return catégorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catégorie basicGetCatégorie() {
		return catégorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatégorie(Catégorie newCatégorie) {
		Catégorie oldCatégorie = catégorie;
		catégorie = newCatégorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.RÉSERVATION__CATÉGORIE, oldCatégorie, catégorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(Date newDateFin) {
		Date oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.RÉSERVATION__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPréalable() {
		return préalable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPréalable(boolean newPréalable) {
		boolean oldPréalable = préalable;
		préalable = newPréalable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.RÉSERVATION__PRÉALABLE, oldPréalable, préalable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getPériodeLocation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.RÉSERVATION__RÉFÈRE:
				if (resolve) return getRéfère();
				return basicGetRéfère();
			case LocationVéhiculePackage.RÉSERVATION__DATE_DÉBUT:
				return getDateDébut();
			case LocationVéhiculePackage.RÉSERVATION__CATÉGORIE:
				if (resolve) return getCatégorie();
				return basicGetCatégorie();
			case LocationVéhiculePackage.RÉSERVATION__DATE_FIN:
				return getDateFin();
			case LocationVéhiculePackage.RÉSERVATION__PRÉALABLE:
				return isPréalable();
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
			case LocationVéhiculePackage.RÉSERVATION__RÉFÈRE:
				setRéfère((Voiture)newValue);
				return;
			case LocationVéhiculePackage.RÉSERVATION__DATE_DÉBUT:
				setDateDébut((Date)newValue);
				return;
			case LocationVéhiculePackage.RÉSERVATION__CATÉGORIE:
				setCatégorie((Catégorie)newValue);
				return;
			case LocationVéhiculePackage.RÉSERVATION__DATE_FIN:
				setDateFin((Date)newValue);
				return;
			case LocationVéhiculePackage.RÉSERVATION__PRÉALABLE:
				setPréalable((Boolean)newValue);
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
			case LocationVéhiculePackage.RÉSERVATION__RÉFÈRE:
				setRéfère((Voiture)null);
				return;
			case LocationVéhiculePackage.RÉSERVATION__DATE_DÉBUT:
				setDateDébut(DATE_DÉBUT_EDEFAULT);
				return;
			case LocationVéhiculePackage.RÉSERVATION__CATÉGORIE:
				setCatégorie((Catégorie)null);
				return;
			case LocationVéhiculePackage.RÉSERVATION__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case LocationVéhiculePackage.RÉSERVATION__PRÉALABLE:
				setPréalable(PRÉALABLE_EDEFAULT);
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
			case LocationVéhiculePackage.RÉSERVATION__RÉFÈRE:
				return réfère != null;
			case LocationVéhiculePackage.RÉSERVATION__DATE_DÉBUT:
				return DATE_DÉBUT_EDEFAULT == null ? dateDébut != null : !DATE_DÉBUT_EDEFAULT.equals(dateDébut);
			case LocationVéhiculePackage.RÉSERVATION__CATÉGORIE:
				return catégorie != null;
			case LocationVéhiculePackage.RÉSERVATION__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case LocationVéhiculePackage.RÉSERVATION__PRÉALABLE:
				return préalable != PRÉALABLE_EDEFAULT;
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
		result.append(" (dateDébut: ");
		result.append(dateDébut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", préalable: ");
		result.append(préalable);
		result.append(')');
		return result.toString();
	}

} //RéservationImpl
