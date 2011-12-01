/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Transfert;
import LocationVehicule.Voiture;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.TransfertImpl#getObjetDuTransfert <em>Objet Du Transfert</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransfertImpl#getDe <em>De</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransfertImpl#getTransfereVers <em>Transfere Vers</em>}</li>
 *   <li>{@link LocationVehicule.impl.TransfertImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransfertImpl extends EObjectImpl implements Transfert {
	/**
	 * The cached value of the '{@link #getObjetDuTransfert() <em>Objet Du Transfert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetDuTransfert()
	 * @generated
	 * @ordered
	 */
	protected Voiture objetDuTransfert;

	/**
	 * The cached value of the '{@link #getDe() <em>De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDe()
	 * @generated
	 * @ordered
	 */
	protected Agence de;

	/**
	 * The cached value of the '{@link #getTransfereVers() <em>Transfere Vers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfereVers()
	 * @generated
	 * @ordered
	 */
	protected Agence transfereVers;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransfertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.TRANSFERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getObjetDuTransfert() {
		if (objetDuTransfert != null && objetDuTransfert.eIsProxy()) {
			InternalEObject oldObjetDuTransfert = (InternalEObject)objetDuTransfert;
			objetDuTransfert = (Voiture)eResolveProxy(oldObjetDuTransfert);
			if (objetDuTransfert != oldObjetDuTransfert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.TRANSFERT__OBJET_DU_TRANSFERT, oldObjetDuTransfert, objetDuTransfert));
			}
		}
		return objetDuTransfert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetObjetDuTransfert() {
		return objetDuTransfert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetDuTransfert(Voiture newObjetDuTransfert) {
		Voiture oldObjetDuTransfert = objetDuTransfert;
		objetDuTransfert = newObjetDuTransfert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSFERT__OBJET_DU_TRANSFERT, oldObjetDuTransfert, objetDuTransfert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getDe() {
		if (de != null && de.eIsProxy()) {
			InternalEObject oldDe = (InternalEObject)de;
			de = (Agence)eResolveProxy(oldDe);
			if (de != oldDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.TRANSFERT__DE, oldDe, de));
			}
		}
		return de;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetDe() {
		return de;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDe(Agence newDe) {
		Agence oldDe = de;
		de = newDe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSFERT__DE, oldDe, de));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getTransfereVers() {
		if (transfereVers != null && transfereVers.eIsProxy()) {
			InternalEObject oldTransfereVers = (InternalEObject)transfereVers;
			transfereVers = (Agence)eResolveProxy(oldTransfereVers);
			if (transfereVers != oldTransfereVers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.TRANSFERT__TRANSFERE_VERS, oldTransfereVers, transfereVers));
			}
		}
		return transfereVers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetTransfereVers() {
		return transfereVers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfereVers(Agence newTransfereVers) {
		Agence oldTransfereVers = transfereVers;
		transfereVers = newTransfereVers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSFERT__TRANSFERE_VERS, oldTransfereVers, transfereVers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.TRANSFERT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVehiculePackage.TRANSFERT__OBJET_DU_TRANSFERT:
				if (resolve) return getObjetDuTransfert();
				return basicGetObjetDuTransfert();
			case LocationVehiculePackage.TRANSFERT__DE:
				if (resolve) return getDe();
				return basicGetDe();
			case LocationVehiculePackage.TRANSFERT__TRANSFERE_VERS:
				if (resolve) return getTransfereVers();
				return basicGetTransfereVers();
			case LocationVehiculePackage.TRANSFERT__DATE:
				return getDate();
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
			case LocationVehiculePackage.TRANSFERT__OBJET_DU_TRANSFERT:
				setObjetDuTransfert((Voiture)newValue);
				return;
			case LocationVehiculePackage.TRANSFERT__DE:
				setDe((Agence)newValue);
				return;
			case LocationVehiculePackage.TRANSFERT__TRANSFERE_VERS:
				setTransfereVers((Agence)newValue);
				return;
			case LocationVehiculePackage.TRANSFERT__DATE:
				setDate((Date)newValue);
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
			case LocationVehiculePackage.TRANSFERT__OBJET_DU_TRANSFERT:
				setObjetDuTransfert((Voiture)null);
				return;
			case LocationVehiculePackage.TRANSFERT__DE:
				setDe((Agence)null);
				return;
			case LocationVehiculePackage.TRANSFERT__TRANSFERE_VERS:
				setTransfereVers((Agence)null);
				return;
			case LocationVehiculePackage.TRANSFERT__DATE:
				setDate(DATE_EDEFAULT);
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
			case LocationVehiculePackage.TRANSFERT__OBJET_DU_TRANSFERT:
				return objetDuTransfert != null;
			case LocationVehiculePackage.TRANSFERT__DE:
				return de != null;
			case LocationVehiculePackage.TRANSFERT__TRANSFERE_VERS:
				return transfereVers != null;
			case LocationVehiculePackage.TRANSFERT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //TransfertImpl
