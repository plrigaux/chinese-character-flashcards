/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Location;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.Voiture;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.LocationImpl#getA <em>A</em>}</li>
 *   <li>{@link LocationVéhicule.impl.LocationImpl#getDateDébut <em>Date Début</em>}</li>
 *   <li>{@link LocationVéhicule.impl.LocationImpl#getDateFin <em>Date Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends EObjectImpl implements Location {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected Voiture a;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getA() {
		if (a != null && a.eIsProxy()) {
			InternalEObject oldA = (InternalEObject)a;
			a = (Voiture)eResolveProxy(oldA);
			if (a != oldA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.LOCATION__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(Voiture newA) {
		Voiture oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.LOCATION__A, oldA, a));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.LOCATION__DATE_DÉBUT, oldDateDébut, dateDébut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.LOCATION__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getPériode() {
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
			case LocationVéhiculePackage.LOCATION__A:
				if (resolve) return getA();
				return basicGetA();
			case LocationVéhiculePackage.LOCATION__DATE_DÉBUT:
				return getDateDébut();
			case LocationVéhiculePackage.LOCATION__DATE_FIN:
				return getDateFin();
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
			case LocationVéhiculePackage.LOCATION__A:
				setA((Voiture)newValue);
				return;
			case LocationVéhiculePackage.LOCATION__DATE_DÉBUT:
				setDateDébut((Date)newValue);
				return;
			case LocationVéhiculePackage.LOCATION__DATE_FIN:
				setDateFin((Date)newValue);
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
			case LocationVéhiculePackage.LOCATION__A:
				setA((Voiture)null);
				return;
			case LocationVéhiculePackage.LOCATION__DATE_DÉBUT:
				setDateDébut(DATE_DÉBUT_EDEFAULT);
				return;
			case LocationVéhiculePackage.LOCATION__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
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
			case LocationVéhiculePackage.LOCATION__A:
				return a != null;
			case LocationVéhiculePackage.LOCATION__DATE_DÉBUT:
				return DATE_DÉBUT_EDEFAULT == null ? dateDébut != null : !DATE_DÉBUT_EDEFAULT.equals(dateDébut);
			case LocationVéhiculePackage.LOCATION__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
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
		result.append(')');
		return result.toString();
	}

} //LocationImpl
