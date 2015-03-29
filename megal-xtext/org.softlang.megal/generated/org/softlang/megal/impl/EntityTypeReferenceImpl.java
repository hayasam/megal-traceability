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

import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.impl.EntityTypeReferenceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.softlang.megal.impl.EntityTypeReferenceImpl#isMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeReferenceImpl extends MinimalEObjectImpl.Container implements EntityTypeReference
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
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeReferenceImpl()
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
		return MegalPackage.Literals.ENTITY_TYPE_REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.ENTITY_TYPE_REFERENCE__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.ENTITY_TYPE_REFERENCE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany()
	{
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany)
	{
		boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.ENTITY_TYPE_REFERENCE__MANY, oldMany, many));
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
			case MegalPackage.ENTITY_TYPE_REFERENCE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case MegalPackage.ENTITY_TYPE_REFERENCE__MANY:
				return isMany();
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
			case MegalPackage.ENTITY_TYPE_REFERENCE__DEFINITION:
				setDefinition((EntityType)newValue);
				return;
			case MegalPackage.ENTITY_TYPE_REFERENCE__MANY:
				setMany((Boolean)newValue);
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
			case MegalPackage.ENTITY_TYPE_REFERENCE__DEFINITION:
				setDefinition((EntityType)null);
				return;
			case MegalPackage.ENTITY_TYPE_REFERENCE__MANY:
				setMany(MANY_EDEFAULT);
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
			case MegalPackage.ENTITY_TYPE_REFERENCE__DEFINITION:
				return definition != null;
			case MegalPackage.ENTITY_TYPE_REFERENCE__MANY:
				return many != MANY_EDEFAULT;
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
			case MegalPackage.ENTITY_TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE:
				return latticeAbove((TypeReference)arguments.get(0));
			case MegalPackage.ENTITY_TYPE_REFERENCE___LATTICE_ABOVE:
				return latticeAbove();
			case MegalPackage.ENTITY_TYPE_REFERENCE___LATTICE_BELOW:
				return latticeBelow();
			case MegalPackage.ENTITY_TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE:
				return latticeBelow((TypeReference)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (many: ");
		result.append(many);
		result.append(')');
		return result.toString();
	}

} //EntityTypeReferenceImpl
