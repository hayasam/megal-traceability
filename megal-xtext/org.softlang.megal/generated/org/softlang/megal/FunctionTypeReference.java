/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.FunctionTypeReference#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.softlang.megal.FunctionTypeReference#getCodomain <em>Codomain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getFunctionTypeReference()
 * @model
 * @generated
 */
public interface FunctionTypeReference extends TypeReference
{
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Entity)
	 * @see org.softlang.megal.MegalPackage#getFunctionTypeReference_Domain()
	 * @model required="true"
	 * @generated
	 */
	Entity getDomain();

	/**
	 * Sets the value of the '{@link org.softlang.megal.FunctionTypeReference#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Entity value);

	/**
	 * Returns the value of the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codomain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain</em>' reference.
	 * @see #setCodomain(Entity)
	 * @see org.softlang.megal.MegalPackage#getFunctionTypeReference_Codomain()
	 * @model required="true"
	 * @generated
	 */
	Entity getCodomain();

	/**
	 * Sets the value of the '{@link org.softlang.megal.FunctionTypeReference#getCodomain <em>Codomain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain</em>' reference.
	 * @see #getCodomain()
	 * @generated
	 */
	void setCodomain(Entity value);

} // FunctionTypeReference
