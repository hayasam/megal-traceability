package org.softlang.megal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.softlang.megal.Annotation;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.FunctionTypeReference;
import org.softlang.megal.Link;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.language.services.MegalGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMegalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MegalGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MegalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MegalPackage.ANNOTATION:
				if(context == grammarAccess.getPrefixAnnotationRule()) {
					sequence_PrefixAnnotation(context, (Annotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getShowNameAnnotationRule()) {
					sequence_ShowNameAnnotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.ENTITY:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.ENTITY_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getEntityTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.ENTITY_TYPE_REFERENCE:
				if(context == grammarAccess.getEntityTypeReferenceRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_EntityTypeReference(context, (EntityTypeReference) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.FUNCTION_APPLICATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getFunctionApplicationRule()) {
					sequence_FunctionApplication(context, (FunctionApplication) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.FUNCTION_TYPE_REFERENCE:
				if(context == grammarAccess.getFunctionTypeReferenceRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_FunctionTypeReference(context, (FunctionTypeReference) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.LINK:
				if(context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.MEGAMODEL:
				if(context == grammarAccess.getMegamodelRule()) {
					sequence_Megamodel(context, (Megamodel) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.RELATIONSHIP:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getRelationshipRule()) {
					sequence_Relationship(context, (Relationship) semanticObject); 
					return; 
				}
				else break;
			case MegalPackage.RELATIONSHIP_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getRelationshipTypeRule()) {
					sequence_RelationshipType(context, (RelationshipType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (definition=[EntityType|QID] many?='+'?)
	 */
	protected void sequence_EntityTypeReference(EObject context, EntityTypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* name=QID annotations+=ShowNameAnnotation? supertype=TypeReference?)
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* (dependent?='?' | parameter?='!')? name=QID annotations+=ShowNameAnnotation? type=TypeReference)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* function=[Entity|QID] input=[Entity|QID] output=[Entity|QID])
	 */
	protected void sequence_FunctionApplication(EObject context, FunctionApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (definition=[EntityType|QID] domain=[Entity|QID] codomain=[Entity|QID])
	 */
	protected void sequence_FunctionTypeReference(EObject context, FunctionTypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MegalPackage.Literals.TYPE_REFERENCE__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegalPackage.Literals.TYPE_REFERENCE__DEFINITION));
			if(transientValues.isValueTransient(semanticObject, MegalPackage.Literals.FUNCTION_TYPE_REFERENCE__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegalPackage.Literals.FUNCTION_TYPE_REFERENCE__DOMAIN));
			if(transientValues.isValueTransient(semanticObject, MegalPackage.Literals.FUNCTION_TYPE_REFERENCE__CODOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MegalPackage.Literals.FUNCTION_TYPE_REFERENCE__CODOMAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionTypeReferenceAccess().getDefinitionEntityTypeQIDParserRuleCall_0_0_1(), semanticObject.getDefinition());
		feeder.accept(grammarAccess.getFunctionTypeReferenceAccess().getDomainEntityQIDParserRuleCall_2_0_1(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getFunctionTypeReferenceAccess().getCodomainEntityQIDParserRuleCall_4_0_1(), semanticObject.getCodomain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* link=[Entity|QID] (input=[Entity|QID] output=[Entity|QID])? to=STRING)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* name=QID (imports+=[Megamodel|QID] | declarations+=Declaration | bindings+=Link)*)
	 */
	protected void sequence_Megamodel(EObject context, Megamodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=QID value=STRING?)
	 */
	protected void sequence_PrefixAnnotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* name=QID annotations+=ShowNameAnnotation? left=TypeReference right=TypeReference)
	 */
	protected void sequence_RelationshipType(EObject context, RelationshipType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=PrefixAnnotation* left=[Entity|QID] type=[RelationshipType|QID] right=[Entity|QID])
	 */
	protected void sequence_Relationship(EObject context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_ShowNameAnnotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
