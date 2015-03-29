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

	/**
	 * Searches a given MegaL Relationship for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param r
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Relationship r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		Entity left = r.getLeft();
		Entity right = r.getRight();
		
		Iterable<Link> leftBindings = Links.allBindings(r.megamodel(), left);
		Iterable<Link> rightBindings = Links.allBindings(r.megamodel(), right);
		
		for (Link leftLink : leftBindings) {
			
			for (Link rightLink : rightBindings) {
				
				TraceabilityLinkTarget leftTarget = new TraceabilityLinkTarget(left, leftLink.getTo());
				TraceabilityLinkTarget rightTarget = new TraceabilityLinkTarget(right, rightLink.getTo());
				
				result.add(new TraceabilityLink(r, leftTarget, rightTarget));
				
			}
			
		}
		
		return result;
		
	}
	
	/**
	 * Searches a given MegaL Megamodel for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param m
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Megamodel m) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		for (Relationship r : FluentIterable.from(m.getDeclarations()).filter(Relationship.class)) {
			
			result.addAll(allDeclaredLinks(r));
			
		}
		
		return result;
		
	}
	
	/**
	 * Searches a given Ecore resource for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param r
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Resource r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		for (Megamodel m : FluentIterable.from(r.getContents()).filter(Megamodel.class)) {
			
			result.addAll(allDeclaredLinks(m));
			
		}
		
		return result;
		
	}
	
	static public List<TraceabilityLink> inferFragmentLinks (List<TraceabilityLink> tlinks) {
		
		return tlinks;
		
	}
	
}
