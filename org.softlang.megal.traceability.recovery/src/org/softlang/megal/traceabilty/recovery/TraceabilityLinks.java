package org.softlang.megal.traceabilty.recovery;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Links;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;

import com.google.common.collect.FluentIterable;

/**
 * 
 * @author maxmeffert
 *
 */
public class TraceabilityLinks {
	
	static public FluentIterable<Relationship> getAllRelationships (Megamodel m) {
		
		return FluentIterable.from(m.getDeclarations()).filter(Relationship.class);
		
	}
	
	static public FluentIterable<Relationship> getAllRelationships (Megamodel m, String name) {
		
		return getAllRelationships(m).filter(r -> r.getType().getName().equals(name));
		
	}
	
	static public FluentIterable<Relationship> getAllRelationshipsWhereLeft (Entity e) {

		return getAllRelationships(e.megamodel()).filter(r -> r.getLeft().equals(e));
		
	}
	
	static public FluentIterable<Relationship> getAllRelationshipsWhereLeft (String name, Entity e) {
		
		return getAllRelationships(e.megamodel(), name).filter(r -> r.getLeft().equals(e));
		
	}
	
	static public FluentIterable<Relationship> getAllRelationshipWhereRight (Entity e) {
		
		return getAllRelationships(e.megamodel()).filter(r -> r.getRight().equals(e));
		
	}
	
	static public FluentIterable<Relationship> getAllRelationshipWhereRight (String name, Entity e) {
		
		return getAllRelationships(e.megamodel(), name).filter(r -> r.getRight().equals(e));
		
	}
	
	static public FluentIterable<Relationship> getElementOfWhereLeft (Entity e) {
		
		return getAllRelationshipsWhereLeft("elementOf", e);
				
	}
	
	static public FluentIterable<Relationship> getElementOfWhereRight (Entity e) {
		
		return getAllRelationshipWhereRight("elementOf", e);
		
	}
	
	static public FluentIterable<Entity> getLanguageOf (Entity e) {
		
		return getElementOfWhereLeft(e)
				.filter(elementOf -> elementOf.getRight().getName().equals("Language"))
				.transform(elementOf -> elementOf.getRight());
		
	}
	
	static public FluentIterable<Entity> getElementOf (Entity e) {
		
		return getElementOfWhereRight(e)
				.transform(elementOf -> elementOf.getLeft());
		
	}
	
	static public FluentIterable<Link> getLinksOf (Entity e) {
		
		return FluentIterable.from(Links.allBindings(e.megamodel(), e));
		
	}
		
	static public FluentIterable<TraceabilityLink> getTraceabilityLinksOf (Relationship r) {
		
		List<TraceabilityLink> links = new ArrayList<TraceabilityLink>();
		
		for (Link left : getLinksOf(r.getLeft())) {
			
			for (Link right : getLinksOf(r.getRight())) {
				
				FluentIterable<Entity> lLangs = getLanguageOf(r.getLeft());
				FluentIterable<Entity> rLangs = getLanguageOf(r.getRight());
				
				if (0 < lLangs.size() && 0 < rLangs.size()) {
					
					String lLang = lLangs.first().get().getName();
					String rLang = rLangs.first().get().getName();
					
					TraceabilityLinkTarget lTarget = new TraceabilityLinkTarget(r.getLeft(), left.getTo());
					TraceabilityLinkTarget rTarget = new TraceabilityLinkTarget(r.getRight(), right.getTo());
									
					links.add(new TraceabilityLink(r, lTarget, rTarget));
					
				}
				
			}
			
		}
		
		return FluentIterable.from(links);
		
	}
	
	static private <T> FluentIterable<T> normalize (FluentIterable<Iterable<T>> tss) {
		
		List<T> result = new ArrayList<T>();
		
		tss.forEach(ts -> ts.forEach(t -> result.add(t)));
		
		return FluentIterable.from(result);
		
	}
	
	static public FluentIterable<TraceabilityLink> getTraceabilityLinksOf (FluentIterable<Relationship> rs) {
		
		return normalize(rs.transform(r -> getTraceabilityLinksOf(r)));
		
	}
	
	static public FluentIterable<TraceabilityLink> getTraceabilityLinks (Megamodel m) {
		
		return getTraceabilityLinksOf(FluentIterable.from(m.getDeclarations()).filter(Relationship.class));
		
	}
	
	static public FluentIterable<TraceabilityLink> getTraceabilityLinks (FluentIterable<Megamodel> ms) {
		
		return normalize(ms.transform(m -> getTraceabilityLinks(m)));
		
	}
	
	static public FluentIterable<TraceabilityLink> getTraceabilityLinks (Resource r) {
		
		return getTraceabilityLinks(FluentIterable.from(r.getContents()).filter(Megamodel.class));
		
	}
	
}
