/**
 */
package org.softlang.megal.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Link;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Megamodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Megamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.impl.MegamodelImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegamodelImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegamodelImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegamodelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegamodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegamodelImpl#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MegamodelImpl extends MinimalEObjectImpl.Container implements Megamodel
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Object ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Object origin = ORIGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> bindings;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Megamodel> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegamodelImpl()
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
		return MegalPackage.Literals.MEGAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, MegalPackage.MEGAMODEL__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOrigin()
	{
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Object newOrigin)
	{
		Object oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAMODEL__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, MegalPackage.MEGAMODEL__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getBindings()
	{
		if (bindings == null)
		{
			bindings = new EObjectContainmentEList<Link>(Link.class, this, MegalPackage.MEGAMODEL__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Megamodel> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectResolvingEList<Megamodel>(Megamodel.class, this, MegalPackage.MEGAMODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<Megamodel> allImports()
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
	public Iterable<Megamodel> allModels()
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
	public Iterable<Annotation> allAnnotations()
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
	public Megamodel megamodel()
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
	public boolean logicEq(EObject o)
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
	public String identity()
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAMODEL__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAMODEL__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAMODEL__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case MegalPackage.MEGAMODEL__ANNOTATIONS:
				return getAnnotations();
			case MegalPackage.MEGAMODEL__ORIGIN:
				return getOrigin();
			case MegalPackage.MEGAMODEL__DECLARATIONS:
				return getDeclarations();
			case MegalPackage.MEGAMODEL__BINDINGS:
				return getBindings();
			case MegalPackage.MEGAMODEL__NAME:
				return getName();
			case MegalPackage.MEGAMODEL__IMPORTS:
				return getImports();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAMODEL__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case MegalPackage.MEGAMODEL__ORIGIN:
				setOrigin(newValue);
				return;
			case MegalPackage.MEGAMODEL__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case MegalPackage.MEGAMODEL__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Link>)newValue);
				return;
			case MegalPackage.MEGAMODEL__NAME:
				setName((String)newValue);
				return;
			case MegalPackage.MEGAMODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Megamodel>)newValue);
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
			case MegalPackage.MEGAMODEL__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case MegalPackage.MEGAMODEL__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case MegalPackage.MEGAMODEL__DECLARATIONS:
				getDeclarations().clear();
				return;
			case MegalPackage.MEGAMODEL__BINDINGS:
				getBindings().clear();
				return;
			case MegalPackage.MEGAMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MegalPackage.MEGAMODEL__IMPORTS:
				getImports().clear();
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
			case MegalPackage.MEGAMODEL__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case MegalPackage.MEGAMODEL__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case MegalPackage.MEGAMODEL__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case MegalPackage.MEGAMODEL__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case MegalPackage.MEGAMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MegalPackage.MEGAMODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
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
			case MegalPackage.MEGAMODEL___ALL_IMPORTS:
				return allImports();
			case MegalPackage.MEGAMODEL___ALL_MODELS:
				return allModels();
			case MegalPackage.MEGAMODEL___ALL_ANNOTATIONS:
				return allAnnotations();
			case MegalPackage.MEGAMODEL___MEGAMODEL:
				return megamodel();
			case MegalPackage.MEGAMODEL___LOGIC_EQ__EOBJECT:
				return logicEq((EObject)arguments.get(0));
			case MegalPackage.MEGAMODEL___IDENTITY:
				return identity();
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
		result.append(" (origin: ");
		result.append(origin);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MegamodelImpl
