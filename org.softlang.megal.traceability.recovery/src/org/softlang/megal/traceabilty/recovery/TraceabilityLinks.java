package org.softlang.megal.traceabilty.recovery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		return getAllRelationships(e.megamodel(), name);
		
	}
	
	static public FluentIterable<Relationship> getElementOfWhereLeft (Entity e) {
		
		return getAllRelationshipsWhereLeft("elementOf", e);
				
	}
	
	static public FluentIterable<Entity> getLanguageOf (Entity e) {
		
		return getElementOfWhereLeft(e)
				.filter(elementOf -> elementOf.getRight().getName().equals("Language"))
				.transform(elementOf -> elementOf.getRight());
		
	}
	
	static public FluentIterable<Link> getLinksOf (Entity e) {
		
		return FluentIterable.from(Links.allBindings(e.megamodel(), e));
		
	}
		
	static public FluentIterable<TraceabilityLink> getTraceabilityLinksOf (Relationship r) {
		
		List<TraceabilityLink> links = new ArrayList<TraceabilityLink>();
		
		for (Link left : getLinksOf(r.getLeft())) {
			
			for (Link right : getLinksOf(r.getRight())) {
				
				TraceabilityLinkTarget leftTarget = new TraceabilityLinkTarget(r.getLeft(), left.getTo());
				TraceabilityLinkTarget rightTarget = new TraceabilityLinkTarget(r.getRight(), right.getTo());
				
				links.add(new TraceabilityLink(r, leftTarget, rightTarget));
				
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
	
	/**
	 * Searches a given MegaL Relationship for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param r
	 * @return
	 */
	static public FluentIterable<TraceabilityLink> allDeclaredLinks (Relationship r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		Entity left = r.getLeft();
		Entity right = r.getRight();
		
		Iterable<Link> leftBindings = Links.allBindings(left.megamodel(), left);
		Iterable<Link> rightBindings = Links.allBindings(r.megamodel(), right);
		
		for (Link leftLink : leftBindings) {
			
			for (Link rightLink : rightBindings) {
				
				TraceabilityLinkTarget leftTarget = new TraceabilityLinkTarget(left, leftLink.getTo());
				TraceabilityLinkTarget rightTarget = new TraceabilityLinkTarget(right, rightLink.getTo());
				
				result.add(new TraceabilityLink(r, leftTarget, rightTarget));
				
			}
			
		}
		
		return FluentIterable.from(result);
		
	}
	
	static public FluentIterable<TraceabilityLink> allDeclaredLinks (Iterable<Relationship> rs) {
		
		List<TraceabilityLink> tls = new ArrayList<TraceabilityLink>();
		
		rs.forEach(r -> allDeclaredLinks(r).forEach(tl -> tls.add(tl)));
		
		return FluentIterable.from(tls);
		
	}
		
	/**
	 * Searches a given MegaL Megamodel for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param m
	 * @return
	 */
	static public FluentIterable<TraceabilityLink> allDeclaredLinks (Megamodel m) {
				
		return allDeclaredLinks(FluentIterable.from(m.getDeclarations()).filter(Relationship.class));
		
	}
		
	/**
	 * Searches a given Ecore resource for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param r
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Resource r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		FluentIterable
			.from(r.getContents())
			.filter(Megamodel.class)
			.forEach(m -> allDeclaredLinks(m).forEach(tl -> result.add(tl)));
		
		return result;
		
	}
		
	/**
	 * 
	 * @param tlinks
	 * @return
	 */
	static public List<TraceabilityLink> inferFragmentLinks (List<TraceabilityLink> tlinks) {
		
		return tlinks;
		
	}
	
}
