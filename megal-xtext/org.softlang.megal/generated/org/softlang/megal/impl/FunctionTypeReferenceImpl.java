/**
 */
package org.softlang.megal.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.FunctionTypeReference;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.impl.FunctionTypeReferenceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.softlang.megal.impl.FunctionTypeReferenceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.softlang.megal.impl.FunctionTypeReferenceImpl#getCodomain <em>Codomain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionTypeReferenceImpl extends MinimalEObjectImpl.Container implements FunctionTypeReference
{
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EntityType definition;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Entity domain;

	/**
	 * The cached value of the '{@link #getCodomain() <em>Codomain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomain()
	 * @generated
	 * @ordered
	 */
	protected Entity codomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeReferenceImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MegalPackage.Literals.FUNCTION_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getDefinition()
	{
		if (definition != null && definition.eIsProxy())
		{
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (EntityType)eResolveProxy(oldDefinition);
			if (definition != oldDefinition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.FUNCTION_TYPE_REFERENCE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetDefinition()
	{
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(EntityType newDefinition)
	{
		EntityType oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FUNCTION_TYPE_REFERENCE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getDomain()
	{
		if (domain != null && domain.eIsProxy())
		{
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Entity)eResolveProxy(oldDomain);
			if (domain != oldDomain)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.FUNCTION_TYPE_REFERENCE__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetDomain()
	{
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Entity newDomain)
	{
		Entity oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FUNCTION_TYPE_REFERENCE__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCodomain()
	{
		if (codomain != null && codomain.eIsProxy())
		{
			InternalEObject oldCodomain = (InternalEObject)codomain;
			codomain = (Entity)eResolveProxy(oldCodomain);
			if (codomain != oldCodomain)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.FUNCTION_TYPE_REFERENCE__CODOMAIN, oldCodomain, codomain));
			}
		}
		return codomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetCodomain()
	{
		return codomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodomain(Entity newCodomain)
	{
		Entity oldCodomain = codomain;
		codomain = newCodomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FUNCTION_TYPE_REFERENCE__CODOMAIN, oldCodomain, codomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean latticeAbove(TypeReference other)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<TypeReference> latticeAbove()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<TypeReference> latticeBelow()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean latticeBelow(TypeReference other)
	{
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case MegalPackage.FUNCTION_TYPE_REFERENCE__CODOMAIN:
				if (resolve) return getCodomain();
				return basicGetCodomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DEFINITION:
				setDefinition((EntityType)newValue);
				return;
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DOMAIN:
				setDomain((Entity)newValue);
				return;
			case MegalPackage.FUNCTION_TYPE_REFERENCE__CODOMAIN:
				setCodomain((Entity)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DEFINITION:
				setDefinition((EntityType)null);
				return;
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DOMAIN:
				setDomain((Entity)null);
				return;
			case MegalPackage.FUNCTION_TYPE_REFERENCE__CODOMAIN:
				setCodomain((Entity)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DEFINITION:
				return definition != null;
			case MegalPackage.FUNCTION_TYPE_REFERENCE__DOMAIN:
				return domain != null;
			case MegalPackage.FUNCTION_TYPE_REFERENCE__CODOMAIN:
				return codomain != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case MegalPackage.FUNCTION_TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE:
				return latticeAbove((TypeReference)arguments.get(0));
			case MegalPackage.FUNCTION_TYPE_REFERENCE___LATTICE_ABOVE:
				return latticeAbove();
			case MegalPackage.FUNCTION_TYPE_REFERENCE___LATTICE_BELOW:
				return latticeBelow();
			case MegalPackage.FUNCTION_TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE:
				return latticeBelow((TypeReference)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FunctionTypeReferenceImpl
