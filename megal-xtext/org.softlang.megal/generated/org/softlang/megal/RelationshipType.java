/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.RelationshipType#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.RelationshipType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends Named
{
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(TypeReference)
	 * @see org.softlang.megal.MegalPackage#getRelationshipType_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.RelationshipType#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(TypeReference)
	 * @see org.softlang.megal.MegalPackage#getRelationshipType_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.RelationshipType#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(TypeReference value);

} // RelationshipType
