/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Agence;
import LocationVéhicule.DossierClient;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.SociétéUERent;

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
 * An implementation of the model object '<em><b>Société UE Rent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.SociétéUERentImpl#getPossède <em>Possède</em>}</li>
 *   <li>{@link LocationVéhicule.impl.SociétéUERentImpl#getEReference1 <em>EReference1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SociétéUERentImpl extends EObjectImpl implements SociétéUERent {
	/**
	 * The cached value of the '{@link #getPossède() <em>Possède</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossède()
	 * @generated
	 * @ordered
	 */
	protected EList<Agence> possède;

	/**
	 * The cached value of the '{@link #getEReference1() <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference1()
	 * @generated
	 * @ordered
	 */
	protected DossierClient eReference1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SociétéUERentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.SOCIÉTÉ_UE_RENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agence> getPossède() {
		if (possède == null) {
			possède = new EObjectResolvingEList<Agence>(Agence.class, this, LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__POSSÈDE);
		}
		return possède;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DossierClient getEReference1() {
		if (eReference1 != null && eReference1.eIsProxy()) {
			InternalEObject oldEReference1 = (InternalEObject)eReference1;
			eReference1 = (DossierClient)eResolveProxy(oldEReference1);
			if (eReference1 != oldEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__EREFERENCE1, oldEReference1, eReference1));
			}
		}
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DossierClient basicGetEReference1() {
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference1(DossierClient newEReference1) {
		DossierClient oldEReference1 = eReference1;
		eReference1 = newEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__EREFERENCE1, oldEReference1, eReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__POSSÈDE:
				return getPossède();
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__EREFERENCE1:
				if (resolve) return getEReference1();
				return basicGetEReference1();
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
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__POSSÈDE:
				getPossède().clear();
				getPossède().addAll((Collection<? extends Agence>)newValue);
				return;
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__EREFERENCE1:
				setEReference1((DossierClient)newValue);
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
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__POSSÈDE:
				getPossède().clear();
				return;
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__EREFERENCE1:
				setEReference1((DossierClient)null);
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
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__POSSÈDE:
				return possède != null && !possède.isEmpty();
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT__EREFERENCE1:
				return eReference1 != null;
		}
		return super.eIsSet(featureID);
	}

} //SociétéUERentImpl
