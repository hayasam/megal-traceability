/**
 */
package org.softlang.megal;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.TypeReference#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getTypeReference()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TypeReference extends EObject
{
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(EntityType)
	 * @see org.softlang.megal.MegalPackage#getTypeReference_Definition()
	 * @model required="true"
	 * @generated
	 */
	EntityType getDefinition();

	/**
	 * Sets the value of the '{@link org.softlang.megal.TypeReference#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(EntityType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean latticeAbove(TypeReference other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.softlang.megal.EIterable<org.softlang.megal.TypeReference>" required="true"
	 * @generated
	 */
	Iterable<TypeReference> latticeAbove();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.softlang.megal.EIterable<org.softlang.megal.TypeReference>" required="true"
	 * @generated
	 */
	Iterable<TypeReference> latticeBelow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean latticeBelow(TypeReference other);

} // TypeReference
