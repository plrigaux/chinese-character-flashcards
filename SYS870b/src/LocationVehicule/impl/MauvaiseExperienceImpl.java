/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.MauvaiseExperience;
import LocationVehicule.Transaction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mauvaise Experience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.MauvaiseExperienceImpl#getRelate <em>Relate</em>}</li>
 *   <li>{@link LocationVehicule.impl.MauvaiseExperienceImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link LocationVehicule.impl.MauvaiseExperienceImpl#getSeRapporteA <em>Se Rapporte A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MauvaiseExperienceImpl extends EObjectImpl implements MauvaiseExperience {
	/**
	 * The cached value of the '{@link #getRelate() <em>Relate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelate()
	 * @generated
	 * @ordered
	 */
	protected Location relate;

	/**
	 * The default value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected String detail = DETAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeRapporteA() <em>Se Rapporte A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeRapporteA()
	 * @generated
	 * @ordered
	 */
	protected Transaction seRapporteA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MauvaiseExperienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.MAUVAISE_EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getRelate() {
		if (relate != null && relate.eIsProxy()) {
			InternalEObject oldRelate = (InternalEObject)relate;
			relate = (Location)eResolveProxy(oldRelate);
			if (relate != oldRelate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.MAUVAISE_EXPERIENCE__RELATE, oldRelate, relate));
			}
		}
		return relate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetRelate() {
		return relate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelate(Location newRelate) {
		Location oldRelate = relate;
		relate = newRelate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.MAUVAISE_EXPERIENCE__RELATE, oldRelate, relate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(String newDetail) {
		String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.MAUVAISE_EXPERIENCE__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getSeRapporteA() {
		if (seRapporteA != null && seRapporteA.eIsProxy()) {
			InternalEObject oldSeRapporteA = (InternalEObject)seRapporteA;
			seRapporteA = (Transaction)eResolveProxy(oldSeRapporteA);
			if (seRapporteA != oldSeRapporteA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.MAUVAISE_EXPERIENCE__SE_RAPPORTE_A, oldSeRapporteA, seRapporteA));
			}
		}
		return seRapporteA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetSeRapporteA() {
		return seRapporteA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeRapporteA(Transaction newSeRapporteA) {
		Transaction oldSeRapporteA = seRapporteA;
		seRapporteA = newSeRapporteA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.MAUVAISE_EXPERIENCE__SE_RAPPORTE_A, oldSeRapporteA, seRapporteA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__RELATE:
				if (resolve) return getRelate();
				return basicGetRelate();
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__DETAIL:
				return getDetail();
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__SE_RAPPORTE_A:
				if (resolve) return getSeRapporteA();
				return basicGetSeRapporteA();
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
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__RELATE:
				setRelate((Location)newValue);
				return;
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__DETAIL:
				setDetail((String)newValue);
				return;
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__SE_RAPPORTE_A:
				setSeRapporteA((Transaction)newValue);
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
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__RELATE:
				setRelate((Location)null);
				return;
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__DETAIL:
				setDetail(DETAIL_EDEFAULT);
				return;
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__SE_RAPPORTE_A:
				setSeRapporteA((Transaction)null);
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
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__RELATE:
				return relate != null;
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__DETAIL:
				return DETAIL_EDEFAULT == null ? detail != null : !DETAIL_EDEFAULT.equals(detail);
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE__SE_RAPPORTE_A:
				return seRapporteA != null;
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
		result.append(" (Detail: ");
		result.append(detail);
		result.append(')');
		return result.toString();
	}

} //MauvaiseExperienceImpl
