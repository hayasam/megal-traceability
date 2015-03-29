/**
 */
package org.softlang.megal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.softlang.megal.MegalFactory
 * @model kind="package"
 * @generated
 */
public interface MegalPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "megal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://softlang.wikidot.com/megal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegalPackage eINSTANCE = org.softlang.megal.impl.MegalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.AnnotationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.Element
	 * @see org.softlang.megal.impl.MegalPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ORIGIN = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ALL_ANNOTATIONS = 0;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MEGAMODEL = 1;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___LOGIC_EQ__EOBJECT = 2;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IDENTITY = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegamodelImpl <em>Megamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegamodelImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegamodel()
	 * @generated
	 */
	int MEGAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__ORIGIN = ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__DECLARATIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__BINDINGS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__IMPORTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___ALL_ANNOTATIONS = ELEMENT___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___MEGAMODEL = ELEMENT___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___LOGIC_EQ__EOBJECT = ELEMENT___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___IDENTITY = ELEMENT___IDENTITY;

	/**
	 * The operation id for the '<em>All Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___ALL_IMPORTS = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>All Models</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___ALL_MODELS = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.LinkImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ORIGIN = ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INPUT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUTPUT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ALL_ANNOTATIONS = ELEMENT___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___MEGAMODEL = ELEMENT___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LOGIC_EQ__EOBJECT = ELEMENT___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___IDENTITY = ELEMENT___IDENTITY;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.DeclarationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ORIGIN = ELEMENT__ORIGIN;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___ALL_ANNOTATIONS = ELEMENT___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___MEGAMODEL = ELEMENT___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___LOGIC_EQ__EOBJECT = ELEMENT___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___IDENTITY = ELEMENT___IDENTITY;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.RelationshipImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ORIGIN = DECLARATION__ORIGIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LEFT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RIGHT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_ANNOTATIONS = DECLARATION___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___MEGAMODEL = DECLARATION___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___LOGIC_EQ__EOBJECT = DECLARATION___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IDENTITY = DECLARATION___IDENTITY;

	/**
	 * The operation id for the '<em>Applied Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___APPLIED_INSTANCE = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.FunctionApplicationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getFunctionApplication()
	 * @generated
	 */
	int FUNCTION_APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__ORIGIN = DECLARATION__ORIGIN;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__FUNCTION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__INPUT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__OUTPUT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION___ALL_ANNOTATIONS = DECLARATION___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION___MEGAMODEL = DECLARATION___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION___LOGIC_EQ__EOBJECT = DECLARATION___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION___IDENTITY = DECLARATION___IDENTITY;

	/**
	 * The number of operations of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.NamedImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__ORIGIN = DECLARATION__ORIGIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___ALL_ANNOTATIONS = DECLARATION___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___MEGAMODEL = DECLARATION___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___LOGIC_EQ__EOBJECT = DECLARATION___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___IDENTITY = DECLARATION___IDENTITY;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.EntityTypeImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ANNOTATIONS = NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ORIGIN = NAMED__ORIGIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SUPERTYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___ALL_ANNOTATIONS = NAMED___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___MEGAMODEL = NAMED___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___LOGIC_EQ__EOBJECT = NAMED___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___IDENTITY = NAMED___IDENTITY;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.RelationshipTypeImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ANNOTATIONS = NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ORIGIN = NAMED__ORIGIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__LEFT = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__RIGHT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___ALL_ANNOTATIONS = NAMED___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___MEGAMODEL = NAMED___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___LOGIC_EQ__EOBJECT = NAMED___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___IDENTITY = NAMED___IDENTITY;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.EntityImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANNOTATIONS = NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ORIGIN = NAMED__ORIGIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DEPENDENT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARAMETER = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ALL_ANNOTATIONS = NAMED___ALL_ANNOTATIONS;

	/**
	 * The operation id for the '<em>Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___MEGAMODEL = NAMED___MEGAMODEL;

	/**
	 * The operation id for the '<em>Logic Eq</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___LOGIC_EQ__EOBJECT = NAMED___LOGIC_EQ__EOBJECT;

	/**
	 * The operation id for the '<em>Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___IDENTITY = NAMED___IDENTITY;

	/**
	 * The operation id for the '<em>Applicable Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___APPLICABLE_OUTGOING__ENTITY = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Applicable Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___APPLICABLE_INCOMING__ENTITY = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.softlang.megal.TypeReference <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.TypeReference
	 * @see org.softlang.megal.impl.MegalPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Lattice Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE = 0;

	/**
	 * The operation id for the '<em>Lattice Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___LATTICE_ABOVE = 1;

	/**
	 * The operation id for the '<em>Lattice Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___LATTICE_BELOW = 2;

	/**
	 * The operation id for the '<em>Lattice Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE = 3;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.FunctionTypeReferenceImpl <em>Function Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.FunctionTypeReferenceImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getFunctionTypeReference()
	 * @generated
	 */
	int FUNCTION_TYPE_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DEFINITION = TYPE_REFERENCE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DOMAIN = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__CODOMAIN = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Lattice Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE = TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE;

	/**
	 * The operation id for the '<em>Lattice Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE___LATTICE_ABOVE = TYPE_REFERENCE___LATTICE_ABOVE;

	/**
	 * The operation id for the '<em>Lattice Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE___LATTICE_BELOW = TYPE_REFERENCE___LATTICE_BELOW;

	/**
	 * The operation id for the '<em>Lattice Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE = TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE;

	/**
	 * The number of operations of the '<em>Function Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.EntityTypeReferenceImpl <em>Entity Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.EntityTypeReferenceImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityTypeReference()
	 * @generated
	 */
	int ENTITY_TYPE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE__DEFINITION = TYPE_REFERENCE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE__MANY = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Lattice Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE = TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE;

	/**
	 * The operation id for the '<em>Lattice Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE___LATTICE_ABOVE = TYPE_REFERENCE___LATTICE_ABOVE;

	/**
	 * The operation id for the '<em>Lattice Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE___LATTICE_BELOW = TYPE_REFERENCE___LATTICE_BELOW;

	/**
	 * The operation id for the '<em>Lattice Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE = TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE;

	/**
	 * The number of operations of the '<em>Entity Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EIterable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Iterable
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEIterable()
	 * @generated
	 */
	int EITERABLE = 14;


	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.softlang.megal.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.softlang.megal.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.softlang.megal.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.softlang.megal.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.Element#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.softlang.megal.Element#getAnnotations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Element#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.softlang.megal.Element#getOrigin()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Origin();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Element#allAnnotations() <em>All Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Annotations</em>' operation.
	 * @see org.softlang.megal.Element#allAnnotations()
	 * @generated
	 */
	EOperation getElement__AllAnnotations();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Element#megamodel() <em>Megamodel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Megamodel</em>' operation.
	 * @see org.softlang.megal.Element#megamodel()
	 * @generated
	 */
	EOperation getElement__Megamodel();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Element#logicEq(org.eclipse.emf.ecore.EObject) <em>Logic Eq</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logic Eq</em>' operation.
	 * @see org.softlang.megal.Element#logicEq(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getElement__LogicEq__EObject();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Element#identity() <em>Identity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identity</em>' operation.
	 * @see org.softlang.megal.Element#identity()
	 * @generated
	 */
	EOperation getElement__Identity();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Megamodel <em>Megamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Megamodel</em>'.
	 * @see org.softlang.megal.Megamodel
	 * @generated
	 */
	EClass getMegamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.Megamodel#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.softlang.megal.Megamodel#getDeclarations()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.Megamodel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.softlang.megal.Megamodel#getBindings()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Megamodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.Megamodel#getName()
	 * @see #getMegamodel()
	 * @generated
	 */
	EAttribute getMegamodel_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.Megamodel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.Megamodel#getImports()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Imports();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#allImports() <em>All Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Imports</em>' operation.
	 * @see org.softlang.megal.Megamodel#allImports()
	 * @generated
	 */
	EOperation getMegamodel__AllImports();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#allModels() <em>All Models</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Models</em>' operation.
	 * @see org.softlang.megal.Megamodel#allModels()
	 * @generated
	 */
	EOperation getMegamodel__AllModels();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.softlang.megal.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Link#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.softlang.megal.Link#getLink()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Link#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.softlang.megal.Link#getTo()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_To();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Link#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.softlang.megal.Link#getInput()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Input();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Link#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.softlang.megal.Link#getOutput()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Output();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.softlang.megal.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.softlang.megal.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Relationship#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.Relationship#getLeft()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Relationship#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.Relationship#getRight()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Right();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Relationship#appliedInstance() <em>Applied Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applied Instance</em>' operation.
	 * @see org.softlang.megal.Relationship#appliedInstance()
	 * @generated
	 */
	EOperation getRelationship__AppliedInstance();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.FunctionApplication <em>Function Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Application</em>'.
	 * @see org.softlang.megal.FunctionApplication
	 * @generated
	 */
	EClass getFunctionApplication();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionApplication#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.softlang.megal.FunctionApplication#getFunction()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Function();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionApplication#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.softlang.megal.FunctionApplication#getInput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Input();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionApplication#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.softlang.megal.FunctionApplication#getOutput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Output();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see org.softlang.megal.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.softlang.megal.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.EntityType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see org.softlang.megal.EntityType#getSupertype()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Supertype();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.softlang.megal.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.RelationshipType#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.softlang.megal.RelationshipType#getLeft()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.RelationshipType#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.softlang.megal.RelationshipType#getRight()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_Right();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.softlang.megal.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.Entity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.softlang.megal.Entity#getType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Entity#isDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent</em>'.
	 * @see org.softlang.megal.Entity#isDependent()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Dependent();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Entity#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.softlang.megal.Entity#isParameter()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Parameter();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Entity#applicableOutgoing(org.softlang.megal.Entity) <em>Applicable Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applicable Outgoing</em>' operation.
	 * @see org.softlang.megal.Entity#applicableOutgoing(org.softlang.megal.Entity)
	 * @generated
	 */
	EOperation getEntity__ApplicableOutgoing__Entity();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Entity#applicableIncoming(org.softlang.megal.Entity) <em>Applicable Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applicable Incoming</em>' operation.
	 * @see org.softlang.megal.Entity#applicableIncoming(org.softlang.megal.Entity)
	 * @generated
	 */
	EOperation getEntity__ApplicableIncoming__Entity();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.softlang.megal.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.TypeReference#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.softlang.megal.TypeReference#getDefinition()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Definition();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.TypeReference#latticeAbove(org.softlang.megal.TypeReference) <em>Lattice Above</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lattice Above</em>' operation.
	 * @see org.softlang.megal.TypeReference#latticeAbove(org.softlang.megal.TypeReference)
	 * @generated
	 */
	EOperation getTypeReference__LatticeAbove__TypeReference();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.TypeReference#latticeAbove() <em>Lattice Above</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lattice Above</em>' operation.
	 * @see org.softlang.megal.TypeReference#latticeAbove()
	 * @generated
	 */
	EOperation getTypeReference__LatticeAbove();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.TypeReference#latticeBelow() <em>Lattice Below</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lattice Below</em>' operation.
	 * @see org.softlang.megal.TypeReference#latticeBelow()
	 * @generated
	 */
	EOperation getTypeReference__LatticeBelow();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.TypeReference#latticeBelow(org.softlang.megal.TypeReference) <em>Lattice Below</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lattice Below</em>' operation.
	 * @see org.softlang.megal.TypeReference#latticeBelow(org.softlang.megal.TypeReference)
	 * @generated
	 */
	EOperation getTypeReference__LatticeBelow__TypeReference();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.FunctionTypeReference <em>Function Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type Reference</em>'.
	 * @see org.softlang.megal.FunctionTypeReference
	 * @generated
	 */
	EClass getFunctionTypeReference();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionTypeReference#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.softlang.megal.FunctionTypeReference#getDomain()
	 * @see #getFunctionTypeReference()
	 * @generated
	 */
	EReference getFunctionTypeReference_Domain();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionTypeReference#getCodomain <em>Codomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Codomain</em>'.
	 * @see org.softlang.megal.FunctionTypeReference#getCodomain()
	 * @see #getFunctionTypeReference()
	 * @generated
	 */
	EReference getFunctionTypeReference_Codomain();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.EntityTypeReference <em>Entity Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type Reference</em>'.
	 * @see org.softlang.megal.EntityTypeReference
	 * @generated
	 */
	EClass getEntityTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.EntityTypeReference#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.softlang.megal.EntityTypeReference#isMany()
	 * @see #getEntityTypeReference()
	 * @generated
	 */
	EAttribute getEntityTypeReference_Many();

	/**
	 * Returns the meta object for data type '{@link java.lang.Iterable <em>EIterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EIterable</em>'.
	 * @see java.lang.Iterable
	 * @model instanceClass="java.lang.Iterable" typeParameters="T"
	 * @generated
	 */
	EDataType getEIterable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MegalFactory getMegalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.AnnotationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.Element
		 * @see org.softlang.megal.impl.MegalPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ANNOTATIONS = eINSTANCE.getElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ORIGIN = eINSTANCE.getElement_Origin();

		/**
		 * The meta object literal for the '<em><b>All Annotations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ALL_ANNOTATIONS = eINSTANCE.getElement__AllAnnotations();

		/**
		 * The meta object literal for the '<em><b>Megamodel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MEGAMODEL = eINSTANCE.getElement__Megamodel();

		/**
		 * The meta object literal for the '<em><b>Logic Eq</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___LOGIC_EQ__EOBJECT = eINSTANCE.getElement__LogicEq__EObject();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___IDENTITY = eINSTANCE.getElement__Identity();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegamodelImpl <em>Megamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegamodelImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegamodel()
		 * @generated
		 */
		EClass MEGAMODEL = eINSTANCE.getMegamodel();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__DECLARATIONS = eINSTANCE.getMegamodel_Declarations();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__BINDINGS = eINSTANCE.getMegamodel_Bindings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAMODEL__NAME = eINSTANCE.getMegamodel_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__IMPORTS = eINSTANCE.getMegamodel_Imports();

		/**
		 * The meta object literal for the '<em><b>All Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___ALL_IMPORTS = eINSTANCE.getMegamodel__AllImports();

		/**
		 * The meta object literal for the '<em><b>All Models</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___ALL_MODELS = eINSTANCE.getMegamodel__AllModels();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.LinkImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINK = eINSTANCE.getLink_Link();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TO = eINSTANCE.getLink_To();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INPUT = eINSTANCE.getLink_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__OUTPUT = eINSTANCE.getLink_Output();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.DeclarationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.RelationshipImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__LEFT = eINSTANCE.getRelationship_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RIGHT = eINSTANCE.getRelationship_Right();

		/**
		 * The meta object literal for the '<em><b>Applied Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___APPLIED_INSTANCE = eINSTANCE.getRelationship__AppliedInstance();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.FunctionApplicationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getFunctionApplication()
		 * @generated
		 */
		EClass FUNCTION_APPLICATION = eINSTANCE.getFunctionApplication();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__FUNCTION = eINSTANCE.getFunctionApplication_Function();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__INPUT = eINSTANCE.getFunctionApplication_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__OUTPUT = eINSTANCE.getFunctionApplication_Output();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.NamedImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.EntityTypeImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SUPERTYPE = eINSTANCE.getEntityType_Supertype();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.RelationshipTypeImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__LEFT = eINSTANCE.getRelationshipType_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__RIGHT = eINSTANCE.getRelationshipType_Right();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.EntityImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__TYPE = eINSTANCE.getEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DEPENDENT = eINSTANCE.getEntity_Dependent();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PARAMETER = eINSTANCE.getEntity_Parameter();

		/**
		 * The meta object literal for the '<em><b>Applicable Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___APPLICABLE_OUTGOING__ENTITY = eINSTANCE.getEntity__ApplicableOutgoing__Entity();

		/**
		 * The meta object literal for the '<em><b>Applicable Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___APPLICABLE_INCOMING__ENTITY = eINSTANCE.getEntity__ApplicableIncoming__Entity();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.TypeReference <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.TypeReference
		 * @see org.softlang.megal.impl.MegalPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__DEFINITION = eINSTANCE.getTypeReference_Definition();

		/**
		 * The meta object literal for the '<em><b>Lattice Above</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___LATTICE_ABOVE__TYPEREFERENCE = eINSTANCE.getTypeReference__LatticeAbove__TypeReference();

		/**
		 * The meta object literal for the '<em><b>Lattice Above</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___LATTICE_ABOVE = eINSTANCE.getTypeReference__LatticeAbove();

		/**
		 * The meta object literal for the '<em><b>Lattice Below</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___LATTICE_BELOW = eINSTANCE.getTypeReference__LatticeBelow();

		/**
		 * The meta object literal for the '<em><b>Lattice Below</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___LATTICE_BELOW__TYPEREFERENCE = eINSTANCE.getTypeReference__LatticeBelow__TypeReference();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.FunctionTypeReferenceImpl <em>Function Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.FunctionTypeReferenceImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getFunctionTypeReference()
		 * @generated
		 */
		EClass FUNCTION_TYPE_REFERENCE = eINSTANCE.getFunctionTypeReference();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE_REFERENCE__DOMAIN = eINSTANCE.getFunctionTypeReference_Domain();

		/**
		 * The meta object literal for the '<em><b>Codomain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE_REFERENCE__CODOMAIN = eINSTANCE.getFunctionTypeReference_Codomain();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.EntityTypeReferenceImpl <em>Entity Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.EntityTypeReferenceImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityTypeReference()
		 * @generated
		 */
		EClass ENTITY_TYPE_REFERENCE = eINSTANCE.getEntityTypeReference();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE_REFERENCE__MANY = eINSTANCE.getEntityTypeReference_Many();

		/**
		 * The meta object literal for the '<em>EIterable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Iterable
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEIterable()
		 * @generated
		 */
		EDataType EITERABLE = eINSTANCE.getEIterable();

	}

} //MegalPackage
