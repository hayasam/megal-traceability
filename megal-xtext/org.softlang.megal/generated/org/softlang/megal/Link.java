/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.Link#getLink <em>Link</em>}</li>
 *   <li>{@link org.softlang.megal.Link#getTo <em>To</em>}</li>
 *   <li>{@link org.softlang.megal.Link#getInput <em>Input</em>}</li>
 *   <li>{@link org.softlang.megal.Link#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Element
{
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Entity)
	 * @see org.softlang.megal.MegalPackage#getLink_Link()
	 * @model required="true"
	 * @generated
	 */
	Entity getLink();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Link#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Entity value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.softlang.megal.MegalPackage#getLink_To()
	 * @model required="true"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Link#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Entity)
	 * @see org.softlang.megal.MegalPackage#getLink_Input()
	 * @model
	 * @generated
	 */
	Entity getInput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Link#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Entity value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Entity)
	 * @see org.softlang.megal.MegalPackage#getLink_Output()
	 * @model
	 * @generated
	 */
	Entity getOutput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Link#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Entity value);

} // Link
